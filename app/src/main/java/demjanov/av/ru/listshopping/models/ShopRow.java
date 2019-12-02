package demjanov.av.ru.listshopping.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ShopRow extends RealmObject {
    @PrimaryKey
    private int idRow;

    public int numberInList;

    private String nameRow;
    private float kol;
    private float shoppedKol = 0;
    private float stepKol;
    private boolean isShopped = false;


    /////////////////////////////////////////////////////
    // Constructors
    ////////////////////////////////////////////////////
    //-----Begin-----------------------------------------

    public ShopRow() {}

    public ShopRow(int idRow, String nameRow) {
        this.idRow = idRow;
        this.nameRow = nameRow;
    }

    public ShopRow(int idRow, String nameRow, float kol) {
        this(idRow, nameRow);
        this.kol = kol;
    }

    public ShopRow(int idRow, String nameRow, float kol, float stepKol) {
        this(idRow, nameRow, kol);
        this.stepKol = stepKol;
    }

    //-----End-------------------------------------------


    /////////////////////////////////////////////////////
    // Getters and Setters
    ////////////////////////////////////////////////////
    //-----Begin-----------------------------------------

    public int getIdRow() {
        return idRow;
    }

    public void setIdRow(int idRow) {
        this.idRow = idRow;
    }

    public String getNameRow() {
        return nameRow;
    }

    public void setNameRow(String nameRow) {
        this.nameRow = nameRow;
    }

    public float getKol() {
        return kol - shoppedKol;
    }

    public void setKol(float kol) {
        this.kol = kol;
    }

    public float getShopedKol() {
        return shoppedKol;
    }

    public void setShopedKol(float shopedKol) {
        this.shoppedKol = shopedKol;
    }

    public float getStepKol() {
        return stepKol;
    }

    public void setStepKol(float stepKol) {
        this.stepKol = stepKol;
    }

    public boolean isShopped() {
        return isShopped;
    }

    public void setShopped(boolean shopped) {
        isShopped = shopped;
    }

    //-----End-------------------------------------------

}
