package hw09.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao<Family> {

  private List<Family> families = new ArrayList<>();

  @Override
  public List<Family> getAllFamilies() {
    return families;
  }

  @Override
  public Family getFamilyByIndex(int index) {
    return this.families.get(index);
  }

  @Override
  public boolean deleteFamily(int index) {
    if(index<0 || index>this.families.size()) return false;
    this.families.remove(index);
    return true;
  }

  @Override
  public boolean deleteFamily(Family f) {
    if(!this.families.contains(f)) return false;
    this.families.remove(f);
    return true;
  }

  @Override
  public void saveFamily(Family o) {
    if(this.families.contains(o)){
      int i = this.families.indexOf(o);
      this.families.set(i,o);
    }
    else this.families.add(o);
  }
}
