package acs.ase.clase.suite;

import acs.ase.clase.mock.faraMock;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTests.class})
@Categories.IncludeCategory(faraMock.class)
public class CustomSuite {
}
