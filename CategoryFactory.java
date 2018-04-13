import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Group 10
 * @version 1
 */
public class CategoryFactory
{
    private HashMap<String, Category> categories;
    
    public CategoryFactory()
    {
        
        categories = new HashMap();
        Category roman = new Category("Roman", 0);
            roman.setPenaltyDaysPeriod(1);
            roman.setPenaltyPeriodPrice(0.25);
            roman.setBorrowDaysLimit(21);

        Category study = new Category("Studieboek", 0);
            study.setPenaltyPeriodPrice(1);
            study.setPenaltyDaysPeriod(7);
            study.setBorrowDaysLimit(30);

        Category aFilm = new Category("A-film", 2);
            aFilm.setPenaltyPeriodPrice(1);
            aFilm.setPenaltyDaysPeriod(2);
            aFilm.setBorrowDaysLimit(0);

        Category bFilm = new Category("B-film", 2);
            bFilm.setPenaltyPeriodPrice(1);
            bFilm.setPenaltyDaysPeriod(3);
            bFilm.setBorrowDaysLimit(3);

        Category classic = new Category("Classic", 2);
            classic.setPenaltyPeriodPrice(1.5);
            classic.setPenaltyDaysPeriod(7);
            classic.setBorrowDaysLimit(10);

        Category populair = new Category("Populair", 1);
            populair.setPenaltyPeriodPrice(2);
            populair.setPenaltyDaysPeriod(7);
            populair.setBorrowDaysLimit(10);

        categories.put(roman.getName().toLowerCase(), roman);
        categories.put(study.getName().toLowerCase(), study);
        categories.put(aFilm.getName().toLowerCase(), aFilm);
        categories.put(bFilm.getName().toLowerCase(), bFilm);
        categories.put(classic.getName().toLowerCase(), classic);
        categories.put(populair.getName().toLowerCase(), populair);
    }

    public Category getCategorie(String category) {

        return categories.get(category.toLowerCase());
    }
}
