import com.task.mealMenuProject.dto.IngredientDtoConverter;
import com.task.mealMenuProject.dto.MealMenuDtoConverter;
import com.task.mealMenuProject.repository.IngredientRepository;
import com.task.mealMenuProject.repository.MealMenuRepository;
import com.task.mealMenuProject.service.MealMenuService;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.mock;

public class MealMenuServiceTest {

 private MealMenuRepository mealMenuRepository;
 private IngredientRepository ingredientRepository;
 private IngredientDtoConverter ingredientDtoConverter;
 private MealMenuService service;
 private MealMenuDtoConverter mealMenuDtoConverter;

@BeforeEach
public void setUp() {
   mealMenuRepository=  mock(MealMenuRepository.class);
   ingredientRepository= mock(IngredientRepository.class);
   ingredientDtoConverter= mock(IngredientDtoConverter.class);
   mealMenuDtoConverter= mock(MealMenuDtoConverter.class);
   service= new MealMenuService(mealMenuRepository,
           ingredientDtoConverter,
           mealMenuDtoConverter,
           ingredientRepository);
}


}
