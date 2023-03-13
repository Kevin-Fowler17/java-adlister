public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
//            adsDao = new ListAdsDao();
            Config config = new Config();
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

//    public static Books getBooksDao() {
//        if (booksDao == null) {
//            Config config = new Config();
//            booksDao = new MySQLBooksDao(config);
//        }
//        return booksDao;
//    }

}
