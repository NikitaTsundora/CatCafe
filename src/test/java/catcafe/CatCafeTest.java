package catcafe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CatCafeTest {

  @Test
  void CatCountIncreases() {
    // given
    CatCafe cafe = new CatCafe();
    FelineOverLord cat = new FelineOverLord("Castorice", 3);

    // when
    cafe.addCat(cat);

    // then
    assertEquals(1, cafe.getCatCount());
  }

  @Test
  void CatCorrectCountReturned() {
    // given
    CatCafe cafe = new CatCafe();
    FelineOverLord cyrene = new FelineOverLord("Cyrene", 2);
    FelineOverLord hyacinthia = new FelineOverLord("Hyacinthia", 3);
    cafe.addCat(cyrene);
    cafe.addCat(hyacinthia);

    // when
    long count = cafe.getCatCount();

    // then
    assertEquals(2, count);
  }

  @Test
  void ZeroCatsReturned() {
    // given
    CatCafe cafe = new CatCafe();

    // when
    long count = cafe.getCatCount();

    // then
    assertEquals(0, count);
  }

  @Test
  void CorrectCatByNameReturned() {
    // given
    CatCafe cafe = new CatCafe();
    FelineOverLord aglaea = new FelineOverLord("Aglaea", 3);
    cafe.addCat(aglaea);
    FelineOverLord evernight = new FelineOverLord("Evernight", 4);
    cafe.addCat(evernight);
    FelineOverLord phainon = new FelineOverLord("Phainon", 5);
    cafe.addCat(phainon);

    // when
    FelineOverLord result = cafe.getCatByName("Evernight");

    // then
    assertEquals(evernight, result);
  }

  @Test
  void NullByWrongNameReturned() {
    // given
    CatCafe cafe = new CatCafe();
    FelineOverLord mydei = new FelineOverLord("Mydei", 5);
    cafe.addCat(mydei);

    // when
    FelineOverLord result = cafe.getCatByName("Phainon");

    // then
    assertNull(result);
  }

  @Test
  void NullByNullNameReturned() {
    // given
    CatCafe cafe = new CatCafe();
    FelineOverLord hyselins = new FelineOverLord("Hyselins", 8);
    cafe.addCat(hyselins);

    // when
    FelineOverLord result = cafe.getCatByName(null);

    // then
    assertNull(result);
  }

  @Test
  void CorrectCatByWeightReturned() {
    // given
    CatCafe cafe = new CatCafe();
    FelineOverLord tribbie = new FelineOverLord("Tribbie", 5);
    cafe.addCat(tribbie);
    FelineOverLord cypher = new FelineOverLord("Cypher", 2);
    cafe.addCat(cypher);

    // when
    FelineOverLord result = cafe.getCatByWeight(5, 6);

    // then
    assertEquals(tribbie, result);
  }

  @Test
  void NullByIncorrectWeightReturned() {
    // given
    CatCafe cafe = new CatCafe();

    // when
    FelineOverLord result = cafe.getCatByWeight(10, 5);

    // then
    assertNull(result);
  }

  @Test
  void NullByNegativeWeightReturned() {
    // given
    CatCafe cafe = new CatCafe();

    // when
    FelineOverLord result = cafe.getCatByWeight(-1, 5);

    // then
    assertNull(result);
  }

  @Test
  void NullByWrongWeightReturned() {
    // given
    CatCafe cafe = new CatCafe();
    FelineOverLord anaxa = new FelineOverLord("Anaxa", 4);
    FelineOverLord cerydra = new FelineOverLord("Cerydra", 6);
    cafe.addCat(anaxa);
    cafe.addCat(cerydra);
    // when
    FelineOverLord result = cafe.getCatByWeight(15, 20);

    // then
    assertNull(result);
  }
}
