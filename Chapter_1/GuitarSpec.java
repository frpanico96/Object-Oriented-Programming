package Chapter_1;

public class GuitarSpec 
{
/* Member Variables */
 private Builder builder;
 private String model;
 private Type type;
 private Wood backWood;
 private Wood topWood;
 private Integer numStrings;

/* Constructor */
 public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Integer numStrings)
 {
     this.builder = builder;
     this.model = model;
     this.type = type;
     this.backWood = backWood;
     this.topWood = topWood;
     this.numStrings = numStrings;
 }

/* Member methods */
 public Builder getBuilder()
 {
     return this.builder;
 }
 public String getModel()
 {
     return this.model;
 }
 public Type getType()
 {
     return this.type;
 }
 public Wood getBackWood()
 {
     return this.backWood;
 }
 public Wood getTopWood()
 {
     return this.topWood;
 }
 public Integer getNumStrings()
 {
     return this.numStrings;
 }
 public Boolean isSpecEqual(GuitarSpec compareSpec)
 {
    Boolean result = true;
    if(this.builder != compareSpec.builder)
    {
        return false;
    }
    if(!(this.model.toLowerCase().equals(compareSpec.model.toLowerCase())))
    {
        return false;
    }
    if(this.type != compareSpec.type)
    {
        return false;
    }
    if(this.backWood != compareSpec.backWood)
    {
        return false;
    }
    if(this.topWood != compareSpec.topWood)
    {
        return false;
    }
    if(this.numStrings != compareSpec.numStrings)
    {
        return false;
    }
    return result;
 }
}
