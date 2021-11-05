package lesson_6;

import java.sql.Connection;

public abstract class DataMapper {
    private ServerDB serverDB;

    public DataMapper(ServerDB serverDB) {
        this.serverDB = serverDB;
    }

    protected Connection connect(){
        return serverDB.connect();
    }

    protected void disconnect(){
        serverDB.disconnect();
    }

}
