# JacksonPolymorphicSerialization
Polymorphic serialization and deserialization using @JsonTypeInfo and @JsonSubTypes annotations

Jackson has a number of flexible ways to map Java objects to and from JSON.Serialization or de-serializing a java object 
is stright forward using jackson.But when you have a Interface or Abstract class which has multiple implementations then 
serializing & De-Serializing  using Jackson is little tricky and this is also called Polymorphic serialization 
& De-Serialization.

I focus on serialization and deserialization of polymorphic types using @JsonTypeInfo and @JsonSubTypes 
which maintain sub type information while serializing java object and recreate the exact sub type.

In the example animal is a Interface and it can be an tiger or a lion, and they both extend the Animal Interface .
While deserializing we want to create the exact animal type and demonstrate the use of @JsonTypeInfo and @JsonSubTypes annotations.
