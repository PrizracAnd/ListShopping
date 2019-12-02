package demjanov.av.ru.listshopping.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Setting extends RealmObject {
    public final static int BOOLEAN_TYPE    = 0;
    public final static int CHECK_BOX_TYPE  = 0;


    @PrimaryKey
    private int idSetting;

    public int sortNum;

    private String nameSetting;
    private int typeSetting;
    private int value;
    private String resourseName;
    
}
