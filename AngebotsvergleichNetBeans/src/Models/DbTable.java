package Models;

import java.util.Hashtable;

public class DbTable {
    private String TableName;
    private String ClassName;
    private Hashtable <String, String> Properties;

    public String getTableName() {
        return TableName;
    }

    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public Hashtable<String, String> getProperties() {
        return Properties;
    }

    public void setProperties(Hashtable<String, String> Properties) {
        this.Properties = Properties;
    }
    
}
