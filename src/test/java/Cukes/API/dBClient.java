package Cukes.API;

/**
 * Created by OzorakM on 21.3.2018.
 */
public interface dBClient {
    boolean isEntryPresentInTable(String table, String idColumnName, String idColumnValue);
}
