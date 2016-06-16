import Models.Company;
import Models.DbTable;
import Models.IEntity;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConn {
    private Connection connection;
    private Hashtable<String, DbTable> TableMap;
    
    public DBConn() {
        connection = this.getConnection("jdbc:mysql://localhost/buchhaltung", "root", "");
        TableMap = new Hashtable<String, DbTable>();
    }

    public Hashtable<String, DbTable> getTableMap() {
        return TableMap;
    }

    public void setTableMap(Hashtable<String, DbTable> TableMap) {
        this.TableMap = TableMap;
    }
    
    public Connection getConnection(String url, String user, String password) {
        try {
            return DriverManager.getConnection(url, "root", "");
        } catch (Exception ex) {
            System.out.println("Connection to " + url + " failed! \n" +
                    ex.getMessage());
            return null;
        }
    }
    
    public Company getById(UUID ID) {
        String SqlString;
        Statement Statement;
        ResultSet Resultset;
        Company retVal= new Company();
        try {
            SqlString = "SELECT * FROM " + "Company" + " Where" + "Id = " + ID;
            Statement = connection.createStatement();
            Resultset = Statement.executeQuery(SqlString);
            
            //Resultset.getString(columnIndex);
        } catch (Exception ex) {
            Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public <T extends IEntity> void Save(Class<T> classType, T entity) {
        DbTable Table = TableMap.get(classType.getSimpleName());
        String SqlString;
        Statement Statement;
        
        try {
            SqlString = "INSERT INTO " + Table.getTableName() + " Values(";
            
            for(Entry<String,String> entry : Table.getProperties().entrySet()){
                Field field = classType.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                if (field.getType().isAssignableFrom(String.class)){
                    SqlString = SqlString + entry.getValue() + " = '" + field.get(entity) + "'";
                }
            }    
            Statement = connection.createStatement();
            Statement.execute(SqlString);
        } catch (Exception ex) {
            Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
