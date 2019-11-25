
object TimeZones extends App{
  var x = java.util.TimeZone.getAvailableIDs();
  var y = x.filter(x => x.contains("Australia/")).map(x => x.substring(10)).sortBy(x => x);
  println(y(0));
}
