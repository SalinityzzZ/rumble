(:JIQS: ShouldRun; Output="({ "i" : 10, "x" : 1 }, { "i" : 11, "x" : 2 }, { "i" : 12, "x" : 3 }, { "i" : 13, "x" : 4 }, { "i" : 14, "x" : 5 }, { "i" : 15, "x" : 6 }, { "i" : 16, "x" : 7 }, { "i" : 17, "x" : 8 }, { "i" : 18, "x" : 9 }, { "i" : 19, "x" : 10 })" :)

for $i at $x in parallelize(10 to 19)
return { "i" : $i, "x" : $x }
