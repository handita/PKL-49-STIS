/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.database;

/**
 *
 * @author Ken
 */
public class DatabaseProperty {

    private static String nama;
    private static String host;
    private static String port;
    private static String username;
    private static String password;

    public static String getHost() {
        return host;
    }

    public static void setHost(String host) {
        DatabaseProperty.host = host;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        DatabaseProperty.nama = nama;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        DatabaseProperty.password = password;
    }

    public static String getPort() {
        return port;
    }

    public static void setPort(String port) {
        DatabaseProperty.port = port;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        DatabaseProperty.username = username;
    }

    

}
