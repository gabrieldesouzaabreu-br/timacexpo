package br.com.httpfluidobjects.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.nfc.Tag;
import android.provider.BaseColumns;
import android.util.Log;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by gabrielabreu on 13/02/17.
 */

public class myDBhelper extends SQLiteOpenHelper implements BaseColumns
{
    public static final String DB_TEST = "test.db";
    public static final String TABLE_NAME = "client_name";
    public static final String TABLE_NAME2 = "cultures";
    public static final String TABLE_NAME3 = "channels";
    public static final String TABLE_NAME4 = "supervisions";
    public static final String NAME = "name";
    public static final String PHONE = "phone";
    public static final String CITY = "city";
    private static myDBhelper sInstance;

    public myDBhelper(Context context){
        super(context, DB_TEST, null, 1);
    }



    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE IF NOT EXISTS visitantes(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT," +
                "atc TEXT," +
                "phone INTEGER," +
                "city TEXT," +
                "culture TEXT," +
                "channel TEXT," +
                "size INTEGER," +
                "cpf INTEGER," +
                "srv TEXT," +
                "date DATE," +
                "tablet TEXT," +
                "client BOOLEAN" +");"
        );

        db.execSQL("CREATE TABLE IF NOT EXISTS client_name(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT," +
                "ATC TEXT" + ");"
        );
        
        db.execSQL("CREATE TABLE IF NOT EXISTS cultures(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT" + ");"
        );

        db.execSQL("CREATE TABLE IF NOT EXISTS channels(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT" + ");"
        );

        db.execSQL("CREATE TABLE IF NOT EXISTS supervisions(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT" + ");"
        );


       /* ContentValues values = new ContentValues();


        values.put(NAME,"Dirceu Bayer");
        //values.put("ATC", "atcteste");
        db.insert(TABLE_NAME, NAME, values);

        values.put(NAME,"Renato Scherer");
        //values.put("ATC","atc2");
        db.insert(TABLE_NAME, NAME, values);

        values.put(NAME,"Joao Sulzbach / Isidoro Kerber");
        //values.put("ATC","atc3");
        db.insert(TABLE_NAME, NAME, values);

        values.put(NAME,"Jose Ricardo Sulzbach");
        //values.put("ATC","atc3");
        db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jair Sulzbach");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Gerson Wink");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Inacio Vogel");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Darci Wathier");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Edio Korner");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Mirno Gallas");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Delio Spellmeier");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Romeu Lindemann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ricardo Lagemann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Milton Froeder");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Elton Schwarz");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Erno Sand");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marco Lagemann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Celso Lohmann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marlice Kohl");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marlene Mattje");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Elmo Stapenhorst");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Licério Heiermann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jorge Dienstmann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Valmir Scheren");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Celso Auler");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Vilson Dhein");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Luiz Frederico Hergemoeler");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"José Echer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marciano Ninow");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marco Aschenbrock");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Joao Milton Kipper");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Gilberto Brune");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Valerio Gross");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jonas Muller");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marcone Messer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Walmor Schwarzbold");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Vilmar Immhof");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Breno Wanderer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Adriano Lagemann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ademar Muller");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Irio Brune");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Rudi Knobloch");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marco Haushild");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jose e Sergio Rickes");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Gerson Doeber");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Bonifacio Schneider");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jones Fensterseifer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Airton Sand Liane");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ademir Uebel");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Januario Scharb");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Romeu Lohmann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Cesar Ahlert");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Enio Wahlbrink");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Hardi Halmenschlager");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Sinesio Volf");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Evair Walter");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Mircon Fiegenbaum");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Valmir Schneider");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Maciel Kaefer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ernei Sulzbach");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Danilo Wulfing");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Flavio Pozzebon");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Lauro Stein");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Admar Baierle");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marco Klein");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Werner Schwambach Filho");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Alvaro Birck Eduardo");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Joao Daniel Berwanger");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Cristiano Meinerz Arno");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Nelson Goldmeyer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Adelar Riva");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Erico Rex");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marino Horst");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Vilson Wiebusch");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jorge Markus");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Graziela Eggers");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Sinesio Wilssmann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Renato Kreimeier");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Nestor Wink");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Angelio Messer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Werner Genehr Konig");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Pedro Aloisio Kaefer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Sergio Kaefer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Nelson Fries");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Anderson Joel Eckert");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Astor Winter");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Elcio Lupatini");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Antenor Heinemann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Cesar Wahlbrink");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Arsenio Messer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Raul Henrique Zang");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Renato A Cord");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Edson P Dahmer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Helio Brackmann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Sildo Brackmann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Valdirio Beutler");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Irno Dentee");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ary Herrmann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Andre Landmeier");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Almir Horst Silvane");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Norberto Horst");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Stefan Richter");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Hugo A Birck");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Elton Wahlbrink");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Airton Wessel");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Paulo Reichert");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marino Prediger");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ariberto Lindemann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"aaMarco Oscar Zirbes");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Anderson Petry");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Dieter Roese");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Traudi Susana Wommer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Silvio Kleber");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Leandro Landmeier");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Astor Gerhardt");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Cristiano Musskopf");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ademir Goldmeyer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Roberto Hollmann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Liro Lagemann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Erson Schwingel");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Adair Becker");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Daniel Becker");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Eri Korte");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Vitor Cristiano Ahlert");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"STR Imigrante");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Barea");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jose ternes");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Nestor Kayser");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Brancão");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ivo Brustolin");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Otavio Neitzel");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Cesar Martni");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Olavo Rambo");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"JNS");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Junior Dresch");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Adelmo Hahn");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Mariano Girardi");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Gerson Klemamn");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Mario Hoffstater");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Mario Arend");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marcelo Petry");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Paulo Zimmer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ismael e Rogerio Munchem");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Celso Ritter");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Romeu Ruphertal");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Roberto Ruphertal");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Thomas shuatz");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"juliano Reichert");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ademar Piulger");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Leandro Bach");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Rogerio Klering");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Tadeu Gossler");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Gilmar Peloso");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Eloi Glaeser");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Venicio de Souza");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Mauro Gabardo");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Gerson Neumann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Valdemar Gramms");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Otto Adams");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Juliano Vendlim");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Dario Adams");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Renato Malmman");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Aloísio Webber");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Paulo Shaffer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ivan Strait");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ricardo Webber");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Joel Pinheiro");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Armenio De Souza");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Adelar Shuster");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jorge Shuster");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Frederico Elias Ely");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Alexandre Rot");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Everaldo Malmman");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Leonardo Webber");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Sergio Lamb");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Paulo Mutzenberg");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Alex Boettcher");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Flavio Pereira");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marcelo Prass");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Diego Dresh");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Lauro Eckes");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marcelo Fiorio");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Moises Grins");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marcelo Hilebrand");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Luis Raimann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Alcides Diels");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Anivo Schkc");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Leandro Dias");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Irineu Klein");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Valdecir Bernardes");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Lauri Miguel Molling");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Auri Herbim");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marcio Fener");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Verno Much");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marcos Seffel");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Moises Luis Cavalin");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Rogerio Ruphental");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Flavio Ranm");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Celso Augusthem");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Luis Cesar Augusthen");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Tarso Heishetl");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Gerson Bicther");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Dilo Silva");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Valter Brustolin");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Vinicola Don Guerino");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Egidio Ost");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Airton Jair da Silva");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Julio Schons");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Erico munchem");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Pedro moschem");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Flavio ricardo moser");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Daniel kunst");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Alecio ecker");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Nelson fiorese");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Selvino rech");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Volmar brezola");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Lucio brezola");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Luis brezola");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Nilson luis lovato");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"gervazio boff");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Enio rossa");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Roberto hanel");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Flavio potreps");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Josemir boni");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Edegar lelling");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Carlos cassel e jorge");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"joni bitelo");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Bernardo plents");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Vina do lago");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Davi rama");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"João alberto webber");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Pedro fritz");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Paulo malter");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Fernando lezar");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Mauro guilherme ely");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Antono ernesto soares da cruz");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ricardo akio kori");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Pedro schon");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Irani webber");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Elton martini");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Danilo fiorio");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Wilson regelim");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Julio jots");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ricardo zanitini");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Seno Messer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Gelmir boff");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Eugenio brezolla");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Leria rosane rolsbah");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Lucas herman");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ilson negri");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Leonir munaretto");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Aquelino nono");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Volmir kich");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jones vais");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Osvaldo libardi");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Leandro foss");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Aquelino scariot");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Renato matias");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Agostinho liziak");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Cleiton schneider");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Airton duppont");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jose cesar selbach");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Decio klering");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Matadouro boa vista");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Claudir peroza");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Lario Knebel");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Adriano florich");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Rogerio florich");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marcio noer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Roeno vainer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Adriano backes");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Adriano webber");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Glademir groebeler");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Harry olavo boetter");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Sarti kich");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jean jacobi");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Valmor tonoli");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Leonir poanegonda");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Elcio sberz");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Olivir mate");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marcone Deuner");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Cabanha parque da serra");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Arlindo munareto");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Irico velber");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Darci model");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Herbert Muller");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Geraldo winter");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Paulo rauber");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Sergio luis bochetti");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Alipio grohmann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Cristiano russel");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Romeu bach");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Dorval bach");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Pedro Lenz");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ricardo daniel moller");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Decio i. Rauber");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Alcino schwaabb");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Clovis colling");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ivo santini");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"James allgayer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Gustavo palandi");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Diego fiorini");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Pedro jorge hoerlle");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Moacir Brackmann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"José Rudimar Schneider");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Luciano Andre Krutzmann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Roberto hanell");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"marcelo immig");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jose hoffmann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Sereno e clarice backes");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Valerio edinguer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Carlos schroer Marli");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Sergio ghesla");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Verno ramm");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Andre strey");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Joao carlos ost");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jose carlos e nestor wink");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Andre guerra");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Luis mazzochini");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Vinicola santini valmir");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jair mazzochini");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Vilmar mazzochini");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Alcides frozi");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Irineu dalarosa");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Irmãos seidel, Rosane, Odair");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"João boetcher");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Juquinha kremer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Vanderlei boetcher");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Leo thuns");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Adriano spaniol");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ito bhon");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Daniel ruphental");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Sidnei shuck");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Orlando morschel");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jonas Blautt/João Pedro/Jesualda");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ildo kintschner");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"João cláudio hansen");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Silverio hansen");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Agostinho gadini");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"agriplugs");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Claudir schneider");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marco Zirbes");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Carlos Vortmann");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Silvério Gehring");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Júlio Roberto Fuhr");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Inácio Griebeler");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Paulo Reckziegel");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Valter schneider");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Normelho lauer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Sandro zardin");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Andre dalagnol");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ildo dalagnol");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Livo kilp");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Joao carlos malman");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Carlos Jacob Wallauer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Rudi Haupenthal");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Adair Becker");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Daerso e Enedir Chapuis");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Mauro Schreiner");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Sadi Kirsten");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ricardo, Lucas, Eliete Weirich");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Tiago Kerber");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Edson Landmeier");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Hedo Dannebrock");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Sergio Onzi");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Darci Onzi");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Valmor Onzi");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jair Cicchelero");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jandir Cicchelero");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Erni scheffer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jacó Henrique Sipp");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Viveiro Marisa");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Daniel Becker");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Nilo marcon");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jacinto e Irani Krindges");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Laércio e Jacinto Klein");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Alair Raimund");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Leonir Klein");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Bruno e Nelsi Krindges");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Célio Anschau");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Dirlei horle");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Enor horle");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Lizeu hoff");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Paulo zimmer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Flávio da Rosa Rodrigues");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"janio Backes");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Lirio arnold");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Adelar Zimmer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ingrid Flaschbaier");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"leonilda Hibner");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Lirio Arnold");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"valdemir Kiekow");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Alexandre Kiekow");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Escola Bom Pastor");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ivo Dalagnol");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Daniel Fernando jung");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Odirlei Rame");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Roberto Rohr");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Roberto Schaabb");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Roberto Knorst");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Armando schimith");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marcelo Haubert");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Sergio Haubert");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Osmar Dirk");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Bertilo Zimmer");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Gilberto segger");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Reinaldo schuck");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Virgilio Frolich");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Marcelo Webber");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Paulo Holtz");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Ricardo Sapiranga");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Mauro Becker");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Décio Kunz");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Nilson Gresler volnei");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Daniel arnold");db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"André Neis");db.insert(TABLE_NAME, NAME, values);
        */

        ContentValues values2 = new ContentValues();
        
        values2.put(NAME,"soja");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"milho");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"trigo");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"arroz");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"feijão");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"sorgo");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"fumo");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"cana-de-açúcar");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"frutas");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"cevada");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"erva-mate");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"centeio");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"aveia");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"canola");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"oliveira");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"malte");db.insert(TABLE_NAME2, NAME, values2);
        values2.put(NAME,"batata");db.insert(TABLE_NAME2, NAME, values2);

        ContentValues values3 = new ContentValues();
        
        
        values3.put(NAME, "LANGUIRU / TEUTONIA/RS - 049");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP PIA / NOVA PETROPOLIS/RS - 013");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP PIA / FELIZ/RS - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SANTA CLARA / CARLOS BARBOSA/RS - 010");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGRIMAR / CAXIAS DO SUL/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP SAO JACO / TEUTONIA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TIROL / TREZE TILIAS/SC - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / LAGES/SC - 102");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TIROL / RIO DAS ANTAS/SC - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERCAMPOS / CAMPO BELO DO SUL/SC - 032");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TIROL / TANGARÁ/SC - 007");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERCAMPOS / CAMPOS NOVOS/SC - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / CAPINZAL/SC - 053");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cooperserra / São Joaquim / SC-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "VENDA DIRETA - Esp Ger SC / Joacaba");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "NOVA SERRANA / SAO JOAQUIM/SC - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TIROL / PERITIBA/SC - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERPLAN / LAGES/SC - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / JOACABA/SC - 105");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPÉRDIA / ERVAL VELHO/SC - 086");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPÉRDIA / SÃO JOSÉ DO CERRITO/SC - 092");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "NOVA SERRANA / BOM JESUS/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Agrícola Fraiburgo / Videira / SC-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Agricola Fraiburgo / Sao Joaquim / SC-003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERCAMPOS / CAMPOS NOVOS/SC - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TIROL / SAO JOAO DO OESTE/SC - 024");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPER A1 / MONDAI/SC - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERATIVA A1 / SANTA HELENA/SC - 009");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPER A1 / BELMONTE/SC - 010");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP A1 / ITAPIRANGA/SC - 024");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPER A1 / PALMITOS/SC - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cooperativa Regional Auriverde");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP A1 / CAIBI/SC - 004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERATIVA A1 / IPORA D OESTE/SC - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TIROL / SAO JOSE DO CEDRO/SC - 015");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TIROL / DESCANSO/SC - 020");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / SAO JOSE DO CEDRO/SC - 085");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Afubra/SMO/SC-012");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP ALFA / SAO MIGUEL D OESTE/SC - 082");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPER A1 / RIQUEZA/SC - 006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPER A1 / DESCANSO/SC - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / GUARUJA DO SUL/SC - 088");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / GUARACIABA/SC - 084");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Odilo/Guaraciaba/SC-018");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AURIVERDE / CUNHATAÍ/SC - 018");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TIROL / CAIBI/SC - 016");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP A1 / TUNAPOLIS/SC - 031");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / ROMELANDIA/SC - 090");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TIROL / ROMELANDIA/SC - 009");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cooperativa A1");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "A1 / PALMITOS/SC - 014");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP A1 / SAO JOAO DO OESTE/SC - 028");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP A1 / SAO JOAO DO OESTE/SC - 030");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERALFA / PARAISO/SC - 091");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SINUELO / GUARACIABA/SC - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Alfa/SMO/SC-083");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COM TRENTINI / PANAMBI/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGROMITOS / ITAPIRANGA / SC-002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIJUI / BAGE/RS - 122");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "VENDA DIRETA - RIO GRANDE/RS");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "MARASCA / CRUZ ALTA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SEMEAR / PELOTAS/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGROFEL / PELOTAS/RS - 049");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISEL / SAO SEPE/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISUL / CACAPAVA DO SUL/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AFUBRA / SAO LOURENCO DO SUL/RS - 014");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AFUBRA / CANGUCU/RS - 029");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGRO MULLER / CANGUCU/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AFUBRA / SAO LOURENCO DO SUL/RS - 026");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "MACHADO HAX COMERCIO DE PRODUTOS RUR");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AFUBRA / CAMAQUA/RS - 009");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISUL / CACAPAVA DO SUL/RS - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIJUI / DOM PEDRITO/RS - 048");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COSULATI / Pelotas / RS001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "KE SOJA / VACARIA/RS - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIJAL / NAO ME TOQUE/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COSULATI / Arroio Grande / RS-039");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGRO COML SAO LOURENCO LTDA/SAO LOURENCO DO SUL/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "C-Vale / Cruz Alta / RS-144");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "A PERIN / SAO FRANCISCO DE ASSIS/RS - 006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "A PERIN / SAO GABRIEL/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "RIZZI / PORTO ALEGRE/RS - 008");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AFUBRA / SANTA CRUZ DO SUL/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CERTAJA DESENV / TAQUARI/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AFUBRA / VENANCIO AIRES/RS - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AFUBRA / SOBRADINHO/RS - 025");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "POLIAGRO / SANTA CRUZ DO SUL/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIEL / RIO PARDO/RS - 026");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SOMMAR SOLUCOES AGRICOLAS LTDA");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "PASCOAL / IJUI/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERJA / SANTO ANTONIO DA PATRULHA/RS - 007");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERJA / MORRINHOS DO SUL/RS - 012");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERJA / JACINTO MACHADO/SC - 010");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CANQUERINI / VIAMAO/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "FRACARI / BAGE/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "MADRUGA / S. GABRIEL/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERJA / TRES CACHOEIRAS/RS - 017");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "PABLO C. MARCELINO / MORRINHOS DO SUL / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP STA CLARA / Nova Roma do Sul / RS-034");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERSULCA / SÃO JOÃO DO SUL/SC - 004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERJA / SANTO ANTONIO DA PATRULHA/RS - 016");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGROTEC / PALMARES DO SUL / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGROFEL / CAPIVARI DO SUL / RS-032");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SANTA CLARA / PARAI/RS - 019");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERLAT / SERAFINA CORREA/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPIBI / NOVA PRATA/RS - 004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPIBI / GUABIJU/RS - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SANTA CLARA / COTIPORA/RS - 025");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPIBI / IBIRAIARAS/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CAIRU / GARIBALDI/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SANTA CLARA / VERANOPOLIS/RS - 020");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CAIRU / BENTO GONCALVES/RS - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AURORA / BENTO GONCALVES/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGRO COML BREDA / GUAPORE/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "BALERINI / VESPASIANO CORREA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP SANTA CLAR / FAGUNDES VARELA/RS - 029");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTAPEL / TAPEJARA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "NOVA PLANTA / VACARIA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SANTA CLARA / ESTACAO/RS - 045");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COAGRISOL / CASCA/RS - 051");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPIBI / IBIRAIARAS/RS - 006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SSUL / VILA MARIA/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SANTA CLARA / DAVID CANABARRO / RS-006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CAPPELLI / Casca / RS001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "BATISTELLO AGRO / DAVID CANABARRO / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COASA / Gentil / RS-008");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGROFEL / CARAZINHO/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "FM / CAPIVARI DO SUL/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CAMPONOVENSE / BARRACAO/RS - 004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AFUBRA / CACHOEIRA DO SUL/RS - 021");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cooperaguo / Agudo / RS-005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Lider Tratores / Cachoeira do Sul / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Itaipu / Saudades / SC - 019");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Itaipu / Serra Alta / SC - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AURIVERDE / CUNHA PORÃ/SC - 015");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "ITAIPU / MODELO/SC - 018");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AURIVERDE / MARAVILHA/SC - 027");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Itaipu / Pinhalzinho / SC - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Itaipu / Bom Jesus / SC - 006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Itaipu / Sul Brasil / SC - 004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Itaipu / Saltinho / SC - 008");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPER ALFA / NOVA ERECHIM/SC - 007");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cooperativa Agroindustrial Alfa");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPER ALFA / CHAPECÓ/SC - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Alfa / Guatambú / SC - 029");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPER ALFA / PLANALTO ALEGRE/SC - 004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Alfa / M. Bormann / SC - 045");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPER ALFA / UNIÃO DO OESTE/SC - 040");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Alfa / Chapecó / SC - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPER ALFA / IRATI/SC - 034");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPER ALFA / JARDINÓPOLIS/SC - 012");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / PALMA SOLA/SC - 036");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / ANCHIETA/SC - 089");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / CAMPO ERE/SC - 081");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / PALMA SOLA/SC - 092");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / SAO LOURENCO DO OESTE/SC - 112");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / SAO LOURENCO DO OESTE/SC - 115");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERALFA / CAMPO ERE/SC - 072");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TRADICAO / PALMA SOLA/SC - 011");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP ALFA / CORONEL FREITAS/SC - 025");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Alfa/Quilombo/SC-023");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / SANTIAGO DO SUL/SC - 018");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / NOVO HORIZONTE/SC - 128");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / LAJEADO GRANDE/SC - 042");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cooperativa Regional Itaipu");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cooperativa Agroindutrial Alfa");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TIROL / CHAPECO/SC - 010");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPER ALFA / ÁGUAS FRIAS/SC - 031");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Alfa / Caxambú / SC - 026");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TIROL / PINHALZINHO/SC - 011");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / UNIAO DO OESTE/SC - 038");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Tradição/Campo Erê/SC -004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPER ALFA / NOVA ITABERABA/SC - 015");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Alfa/ Formosa/SC-013");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPÉRDIA / ÁGUA DOCE/SC - 094");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPÉRDIA / ÁGUA DOCE/SC - 072");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERVIL / CAÇADOR/SC - 031");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPÉRDIA / CATANDUVAS/SC - 088");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPÉRDIA / LUZERNA/SC - 085");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPÉRDIA / TREZE TÍLIAS/SC - 077");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERCAMPOS / CURITIBANOS/SC - 028");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERVIL / RIO DAS ANTAS/SC - 014");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERVIL / FRAIBURGO/SC - 022");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Coperacel / Campos Novos / SC-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERVIL / TANGARÁ/SC - 029");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERCAMPOS / BRUNÓPOLIS/SC - 042");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERCAMPOS / FRAIBURGO/SC - 055");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOCAM / CAMPOS NOVOS/SC - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERVIL / VIDEIRA/SC - 010");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPÉRDIA / OURO/SC - 095");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERVIL / TANGARÁ/SC - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERVIL / IOMERÊ/SC - 016");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPÉRDIA / JABORÁ/SC - 091");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERVIL / VIDEIRA/SC - 018");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPÉRDIA / VARGEM BONITA/SC - 074");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERIO / IBICARE/SC - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERVIL / ARROIO TRINTA/SC - 021");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPÉRDIA / HERVAL D' OESTE/SC - 081");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERVIL / SALTO VELOSO/SC - 006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COACCER / CAMPOS NOVOS/SC - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGROCOM SANDRI / TAIO/SC - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SANDRI / GUARAMIRIM/SC - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SANDRI / OURO DA TERRA / SC-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SANDRI / CORUPA / SC-009");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / IRINEOPOLIS/SC - 080");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / IRINEOPOLIS/SC - 104");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cravil / Taio / SC-073");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cravil / Pouso Redondo / SC-012");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cravil / Rio Do Cedros / SC-043");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CRAVIL / RIO DO SUL/SC - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "BELAGRICOLA / Canoinhas / SC-100");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / BELA VISTA DO TOLDO/SC - 101");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / IRINEOPOLIS/SC - 071");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Copérdia / Canoinhas / SC-070");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / MAJOR VIEIRA/SC - 069");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cravil / Agronomica / SC-023");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / BELA VISTA DO TOLDO/SC - 073");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / MAFRA/SC - 098");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cooperalfa / Felipe Shimidt / SC-103");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AFUBRA / RIO NEGRO/PR - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cravil / Benedito Novo / SC-042");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cravil / Rio do Oeste / SC-015");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cravil / Itajai / SC-002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERIO / MAFRA/SC - 072");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "RIO DO PEIXE / IRINEOPOLIS/SC - 082");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "BELAGRICOLA / Mafra / SC-104");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SUL DEFENSIVOS / MAFRA/SC - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERIO / ITAIOPOLIS/SC - 071");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cravil / Guaramirim / SC-077");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / MAFRA/SC - 119");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / CANOINHAS/SC - 100");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cooperalfa / Papanduva / SC-116");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SUPERAGRO / SC-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cooperalfa / Major Vieira / SC-117");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "VENDA DIRETA - Esp Ger SC / Litoral");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cravil / Presidente Getulio / SC-013");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cravil / Braço do Trombudo / SC-025");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CRAVIL / LONTRAS/SC - 009");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / PORTO UNIAO/SC - 106");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / PORTO UNIAO/SC - 105");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Copercampos/Otacilio Costa/SC -058");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERCAMPOS / BOM RETIRO/SC - 052");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERCAMPOS / ANITA GARIBALDI/SC - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Copercampos/Coxilha Rica/SC -063");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / LINDÓIA DO SUL/SC - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / VARGEÃO/SC - 083");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Alfa/Xaxim/SC-024");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Alfa/C. Martins/SC-027");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Alfa/Marema/SC-033");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / OURO VERDE/SC - 032");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Alfa/Xanxerê/SC-046");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SEMENTES BORTOLUZZI / XANXERÊ / SC-0001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / IPUMIRIM/SC - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / SAO DOMINGOS/SC - 061");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TIROL / IPUMIRIM/SC - 008");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / IPUACU/SC - 099");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / FAXINAL DOS GUEDES/SC - 084");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "C VALE / FAXINAL DOS GUEDES/SC - 025");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TIROL / SAO DOMINGOS/SC - 018");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOCAM / CURITIBANOS/SC - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / PASSOS MAIA/SC - 050");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / PONTE SERRADA/SC - 023");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "VIVIANE CATAPAN TESTA ME");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPERDIA / IRANI/SC - 068");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Copercampos / Zortea / SC-006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP ALFA / SAO DOMINGOS/SC - 060");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOCAM / LEBÓN RÉGIS/SC - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPÉRDIA / CONCÓRDIA/SC - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / XAXIM/SC - 054");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / XANXERE/SC - 046");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CRAVIL / ITUPORANGA/SC - 004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TERRANOVA / ALFREDO WAGNER/SC - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CRAVIL / ATALANTA/SC - 017");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CRAVIL / VIDAL RAMOS/SC - 027");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CRAVIL / PETROLANDIA/SC - 011");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cravil / Rio do Campo / SC-021");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CRAVIL / ALFREDO WAGNER/SC - 033");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CRAVIL / BOM RETIRO/SC - 041");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AFUBRA / ITUPORANGA/SC - 016");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cravil / Santa Terezinha / SC-079");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SANDRI / AGRO TOP / SC-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SANDRI / ZECAO / SC-003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGROPECUÁRIA DO ROSA / ANTONIO CARLOS / SC-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Nutriterra / Aguas Mornas / SC-002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Nutrisollo / Angelina / SC-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPAGRO / TUBARÃO/SC - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Nutriterra / Rancho Queimado / SC-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Terranova / Leoberto Leal / SC-004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AURIVERDE / MORRO DA FUMAÇA/SC - 044");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AURIVERDE / LAURO MULLER/SC - 049");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERALFA / BRACO DO NORTE/SC - 050");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP AURIVERDE / ORLEANS/SC - 046");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Afubra/Araranguá/SC-006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AURIVERDE / GRÃO PARÁ/SC - 051");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Afubra/ Braço do Norte/ SC-019");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Afubra/ Tubarão/ SC-004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERSULCA / MELEIRO/SC - 021");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERSULCA / FORQUILINHA/SC - 023");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERSULCA / MARACAJÁ/SC - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cooperja/Jacinto Machado/SC-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERSULCA / TURVO/SC - 028");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / SARANDI/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "BONFANTI / BOA VISTA DAS MISSOES/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / SARANDI/RS - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / NOVO XINGU/RS - 009");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / NOVA BOA VISTA/RS - 028");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / SARANDI/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / RONDA ALTA/RS - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / SARANDI/RS - 030");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / ALMIRANTE TAMANDARE/RS - 040");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / ENGENHO VELHO/RS - 041");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / SEBERI/RS - 055");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / SARANDI/RS - 004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / CHAPADA/RS - 022");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / PALMEIRA DAS MISSÕES / RS-068");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / NOVO BARREIRO/RS - 058");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / RONDINHA/RS - 050");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / PONTAO/RS - 013");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / PONTAO/RS - 052");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / BARRA FUNDA/RS - 039");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / CERRO GRANDE/RS - 008");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRICAMPO / BOM PROGRESSO/RS - 034");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COAGRISOL / BARROS CASSAL/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL/ SAGRADA FAMILIA / RS-061");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / SÃO JOSÉ DAS MISSÕES / RS-059");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / SÃO PEDRO DAS MISSÕES / RS-071");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "DESTRI / SARANDI/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Triticola / TRES PALMEIRAS/RS - 012");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / SARANDI/RS - 035");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISAL / BOA VISTA DAS MISSÕES / RS-072");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP TRIT SARANDI LTDA / LIBERATO SALZANO/RS - 025");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPAC / Constantina / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPAC / Rondinha / RS-005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGRINOVA / PANAMBI/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISA / SANTO ANGELO/RS - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "PIA / MARAU/RS - 015");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SANTA CLARA / VILA MARIA/RS - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Agrop Novo Milênio / Ibiaçá / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COASA / AGUA SANTA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "E. O. Roos / Carazinho / RS004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "E. O. Roos SB / Carazinho / RS-007");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SOTRIMA / VACARIA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISOJA / TAPERA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COASA / Engenho Grande / RS-004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COASA/ Santa Cecília do Sul / RS-006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COASA / Laranjeira / RS-017");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "E. O. Roos / Ernestina / RS-010");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "E. O. Roos / Pontão / RS-005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Central Grãos SEDE / Passo Fundo / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "E. O. Roos / Santo Antônio do Planalto / RS-003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "E. O. Roos / Almirante Tamandaré do Sul / RS-011");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIEL / ESPUMOSO/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIEL / ESPUMOSO/RS - 009");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "C-Vale / Fortaleza dos Valos");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Agrofel / Salto do Jacuí / RS-044");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "E. O. Roos /  Tio Hugo / RS-009");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISOJA / SELBACH/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "União Agrocomercial / Ibirubá / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COFA / FORTALEZA DOS VALOS/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "JL / QUINZE DE NOVEMBRO/RS - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "LOSER / IBIRUBA/RS - 004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIEL / SALTO DO JACUI/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIEL / ESPUMOSO/RS - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COM REP SOL SUL / NAO ME TOQUE/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIEL / ESPUMOSO/RS - 024");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "E. O. Roos / Santa Bárbara do Sul / RS-006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Real / Não Me Toque / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "LOSER LTDA / QUINZE DE NOVEMBRO/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COAGRISOL / ERNESTINA/RS - 041");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TOSAGRO / SELBACH/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "FAROL / SANANDUVA/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISANA / SANANDUVA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Orildo Devens/ São João Da Urtiga/RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COAMUR / SAO JOAO DA URTIGA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Copercampos / Sananduva / RS-006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "OURENSE / SAO JOSE DO OURO/RS - 008");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Olfar / Capoere / RS-007");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Olfar / Gaurama / RS-008");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Olfar / Erechin / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COASA / Caseiros / RS-015");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "EUCLIDES / ANTA GORDA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COAGRISOL / NOVA ALVORADA/RS - 006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COAGRISOL / IBIRAPUITÃ/RS - 007");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COAGRISOL / MORMAÇO/RS - 010");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COAGRISOL / FONTOURA XAVIER/RS - 014");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COAGRISOL / SOLEDADE/RS - 004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COAGRISOL / ARVOREZINHA/RS - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COATRSOL / TUNAS/RS - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AFUBRA / SOBRADINHO/RS - 024");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGRO PROGRESSO / PROGRESSO / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COAGRISOL / JACUIZINHO/RS - 067");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIEL / ESTRELA VELHA/RS - 008");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIJUC / JULIO DE CASTILHOS/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIJUC / JULIO DE CASTILHOS/RS - 019");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CAMNPAL / NOVA PALMA/RS - 007");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGROPAN / TUPANCIRETA/RS - 012");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CAMNPAL / NOVA PALMA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "RuralTec / São José do Ouro / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Coperdia/ Gaurama/RS-061");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Coperdia /  Severiano Almeida / RS-060");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Coperdia / Aratiba / RS-058");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "LUCIANO / ERECHIM/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Kesoja / Erechim / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "RuralTec/ São Jose do Ouro/RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cerealista Taufer/ Machadinho/RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP Santa Clara/ Estação / RS-045");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP A M OURENS / CACIQUE DOBLE/RS - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CAMOL / SANTO EXPEDITO DO SUL/RS - 006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Olfar / Machadinho / RS-026");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CAMOL / SAO JOSE DO OURO/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "VACCARO / ERECHIM/RS - 009");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "VACCARO / ERECHIM/RS - 011");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP SANANDUVA / ESMERALDA/RS - 013");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP SANANDUVA / PINHAL DA SERRA/RS - 012");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP A M OURENS / BARRACAO/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Oleoplan / Estação/RS-014");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "PERIN / SANTA MARIA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "DOELER / SAO PEDRO DO SUL/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CAAL / ALEGRETE/RS - 015");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "GONCALVES / SAO GABRIEL/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOMAT / TOROPI/RS - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRISEL / SAO SEPE/RS - 013");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOMAT / Toropi / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGROSER / URUGUAIANA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERAGRO / SAO PEDRO DO SUL/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "BDC AGRO / ROSÁRIO/RS - 006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Santa Macchina / Santa Maria / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "C-Vale / Palmeira das Missões / RS - 100");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cotrifred / Frederico Westphalen / RS - 032");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cotrifred / Caiçara / RS - 014");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cotrifred / Iraí / RS - 020");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cotrifred / Taquaruçu do Sul / RS - 029");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP A1 / ERVAL SECO/RS - 038");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cotrifred / Palmitinho / RS - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP A1 / RODEIO BONITO/RS - 034");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "BONI / TENENTE PORTELA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP A1 / PLANALTO/RS - 035");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP A1 / NOVO TIRADENTES/RS - 042");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TERRA FORTE / FREDERICO WESTPHALEN/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIROSA / SANTA ROSA/RS - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "JOSE DINON / TUPARENDI/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Santagro / EUGENIO DE CASTRO / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGROFEL / SANTO ANGELO/RS - 051");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COMTUL / TUCUNDUVA/RS - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP TUCUNDUVA / NOVO MACHADO/RS - 011");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIROSA / SANTA ROSA/RS - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TUCUNDUVA / GUARANI DAS MISSOES/RS - 009");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "G E G / TUPARENDI/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIROSA / SANTA ROSA/RS - 008");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COMTUL / TUCUNDUVA/RS - 012");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COMTUL / GUARANI DAS MISSOES/RS - 019");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERAGRICOLA / TUCUNDUVA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COMTUL / TUCUNDUVA/RS - 006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COMTUL / TUCUNDUVA/RS - 008");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIROSA / SANTA ROSA/RS - 016");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIROSA / SANTA ROSA/RS - 012");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Danagro / Santo Ângelo / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COMTUL / BOA VISTA DAS MISSOES/RS - 014");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "TREVOSUL / SANTA ROSA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CEREALISTA / TUPARENDI / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Agropecuária Querência / Cerro Largo / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPATRIGO / SAO LUIZ GONZAGA/RS - 038");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "SEMT LAZAROTTO / Entre-Ijuis / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COPAGRIL COML AGR PICCOLI LTDA");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Coopermil / Doutor Maurício Cardoso / MS-055");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "LAZAROTTO E SCHEEREN / Sete de Setembro / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Cotricampo / Coronel Bicaco / RS-046");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRICAMPO / TRES PASSOS/RS - 004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRICAMPO / SAO MARTINHO/RS - 006");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Agrosol / Três de Maio /RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRICAMPO / REDENTORA/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRICAMPO / BRAGA/RS - 010");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRICAMPO / CAMPO NOVO/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRICAMPO / CRISSIUMAL/RS - 008");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRICAMPO / CRISSIUMAL/RS - 042");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRICAMPO / CAMPO NOVO/RS - 022");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRICAMPO / ALEGRIA/RS - 018");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRICAMPO / SEDE NOVA/RS - 007");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRICAMPO / TIRADENTES DO SUL/RS - 005");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Imacol Pecuária / Santo Augusto / RS-003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Henicka & Frizzo / Humaitá / RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRICAMPO / CAMPO NOVO/RS - 003");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Agropecuária Ouro Verde / Boa Vista do Buricá / RS - 0001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "CASSOL / TRES DE MAIO/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIMAIO / TRES DE MAIO/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPERVISAO / HORIZONTINA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIMAIO / HORIZONTINA/RS - 037");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIMAIO / DOUTOR MAURICIO CARDOSO/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIMAIO / TIRADENTES DO SUL/RS - 015");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIMAIO / HORIZONTINA/RS - 018");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIMAIO / SAO JOSE INHOCORA/RS - 047");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIMAIO / ALEGRIA/RS - 009");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP URUGUAI / BOA VISTA DO BURICA/RS - 007");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIMAIO / CRISSIUMAL/RS - 004");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIMAIO / INDEPENDENCIA/RS - 008");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIMAIO / TRES DE MAIO/RS - 022");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOPATRIGO / SAO LUIZ GONZAGA/RS - 049");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Imembuy / São Borja / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "C-Vale / Jóia / RS-160");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "C-Vale / Catuípe / RS-159");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "C-Vale / Bozano / RS-159");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AURELIO / AUGUSTO PESTANA/RS - 002");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "Imacol / Santo Augusto / RS-001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "RAIZES / SANTO AUGUSTO/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIPAL / PEJUCARA/RS - 028");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COTRIMAIO / BOA VISTA DO INCRA/RS - 071");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "COOP ALTO URUGU / CRUZ ALTA/RS - 013");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "REBELATO FARMAC / PEJUCARA/RS - 001");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "AGROFEL / SANTA BARBARA DO SUL/RS - 011");db.insert(TABLE_NAME3, NAME, values3); values3.put(NAME,
                "VETER REBELATO / CRUZ ALTA/RS - 001");db.insert(TABLE_NAME3, NAME, values3);

        ContentValues values4 = new ContentValues();

        values4.put(NAME,"Pelotas");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Santa Cruz do Sul");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Caxias do Sul");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Bento Gonçalves");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Alegrete");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Frederico Westphalen");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Santa Rosa");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Três de Maio");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"São Luis Gonzaga");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Ijuí");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Sarandi");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Passo Fundo");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Não Me Toque");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Sananduva");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Soledade");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Júlio de Castilhos");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Erechim");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"São Miguel do Oeste");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Joaçaba");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Mafra");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Serra");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Xanxerê");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Vale");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"Araranguá");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"RS Planalto");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"RS Pampa");db.insert(TABLE_NAME4, NAME, values4);
        values4.put(NAME,"SC Oeste");db.insert(TABLE_NAME4, NAME, values4);


        //db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + "visitantes");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }


    public static synchronized myDBhelper getInstance(Context context) {

        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (sInstance == null) {
            sInstance = new myDBhelper(context.getApplicationContext());
        }
        return sInstance;
    }
}

