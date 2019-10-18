# TBuilder
ListBuilder MapBuilder  - java

usage

List list = ListBuilder.build().add("kotlin").add("swift").add("dart").add("python").get();
Map map = MapBuilder.build().add("java","kotlin").add("object-c","swift").add("react","dart").add("ruby","python").get();
Toast.makeText(this,list.toString(),Toast.LENGTH_LONG).show();
Toast.makeText(this,map.toString(),Toast.LENGTH_LONG).show();
