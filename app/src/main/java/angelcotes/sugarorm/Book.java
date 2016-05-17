package angelcotes.sugarorm;

import com.orm.SugarRecord;
import com.orm.dsl.Table;

import java.util.ArrayList;

/**
 * Created by Angel on 16/05/2016.
 */
public class Book extends SugarRecord{

    public String name;
    public String Last;

    public String getLast() {
        return Last;
    }

    public String getName() {
        return name;
    }

    public Book(String title, String edition){
        this.name = title;
        this.Last = edition;
        this.save();
    }

}
