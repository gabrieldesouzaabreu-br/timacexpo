package br.com.httpfluidobjects.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * Created by gabrielabreu on 14/02/17.
 */

public class clientsDBHelper extends SQLiteOpenHelper implements BaseColumns
{

    public static final String DB_TEST = "test.db";
    public static final String TABLE_NAME = "client_name";
    public static final String NAME = "name";

    private static clientsDBHelper sInstance;

    private clientsDBHelper(Context context){
        super(context, DB_TEST, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE IF NOT EXISTS client_name(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT" + ");"
        );


        ContentValues values = new ContentValues();

        values.put(NAME,"Dirceu Bayer");
        db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Renato Scherer");
        db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Joao Sulzbach / Isidoro Kerber");
        db.insert(TABLE_NAME, NAME, values);
        values.put(NAME,"Jose Ricardo Sulzbach");db.insert(TABLE_NAME, NAME, values);
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

        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void Insert(SQLiteDatabase db, String name){
        String sqlQuery = "INSERT INTO clients (name) VALUES (" + name + ")";

        db.execSQL(sqlQuery);
    }


    public static synchronized clientsDBHelper getInstance(Context context) {

        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (sInstance == null) {
            sInstance = new clientsDBHelper(context.getApplicationContext());
        }
        return sInstance;
    }

    public ArrayList<String> getNamesFromDB() {

        final String TABLE_NAME = "client_name";

        String selectQuery = "SELECT  * FROM " + TABLE_NAME;
        SQLiteDatabase db  = this.getReadableDatabase();
        Cursor cursor      = db.rawQuery(selectQuery, null);
        ArrayList<String> data      = new ArrayList<String>();

        if (cursor.moveToFirst()) {
            do {
                data.add(cursor.getString(cursor.getColumnIndex("name")));
            } while (cursor.moveToNext());
        }
        cursor.close();
        return data;
    }



}


