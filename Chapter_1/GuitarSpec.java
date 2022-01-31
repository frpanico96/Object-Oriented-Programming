package Chapter_1;

public class GuitarSpec 
{
/* Member Variables */
 private Builder builder;
 private String model;
 private Type type;
 private Wood backWood;
 private Wood topWood;

/* Constructor */
 public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood)
 {
     this.builder = builder;
     this.model = model;
     this.type = type;
     this.backWood = backWood;
     this.topWood = topWood;
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
}
