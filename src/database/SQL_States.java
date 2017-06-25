package database;

/**
 * Created by young on 25.06.2017.
 */
public class SQL_States {

    //Tables
    private final static String TBL_aol = "aoldata.querydata";

    private final static String querytime = "querytime";
    private final static String extractMonth = "extract(month from " + querytime + ")";

    public final static String CLICKS_PER_MONTHS = "SELECT COUNT(" + extractMonth + ") AS Anzahl, " +
            "CASE WHEN " + extractMonth + " = 3 then 'Maerz' " +
            "WHEN " + extractMonth + " = 4 then 'April' " +
            "WHEN " + extractMonth + " = 5 then 'Mai' end as Monate " +
            "FROM " + TBL_aol + " " +
            "WHERE query Like '%miss usa%' " +
            "GROUP BY " + extractMonth + " " +
            "ORDER BY " + extractMonth;

}
