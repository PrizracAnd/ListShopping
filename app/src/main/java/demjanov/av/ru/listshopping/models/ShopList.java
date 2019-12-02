package demjanov.av.ru.listshopping.models;


import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ShopList extends RealmObject {
    @PrimaryKey
    private int idList;

    public int sortNum;

    private String nameList;
    private double dataOpen;
    private double dataClose = 0;

    /////////////////////////////////////////////////////
    // Constructors
    ////////////////////////////////////////////////////
    //-----Begin-----------------------------------------

    public ShopList() {
    }

    public ShopList(int idList, String nameList, double dataOpen) {
        this.idList = idList;
        this.nameList = nameList;
        this.dataOpen = dataOpen;
    }
    //-----End-------------------------------------------


    /////////////////////////////////////////////////////
    // Getters and Setters
    ////////////////////////////////////////////////////
    //-----Begin-----------------------------------------

    public int getIdList() {
        return idList;
    }

    public void setIdList(int idList) {
        this.idList = idList;
    }

    public String getNameList() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList = nameList;
    }

    public double getDataOpen() {
        return dataOpen;
    }

    public void setDataOpen(double dataOpen) {
        this.dataOpen = dataOpen;
    }

    public double getDataClose() {
        return dataClose;
    }

    public void setDataClose(double dataClose) {
        this.dataClose = dataClose;
    }

    //-----End-------------------------------------------
}
