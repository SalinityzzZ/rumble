(:JIQS: ShouldCrash; ErrorCode="XPTY0004"; ErrorMetadata="LINE:3:COLUMN:4:" :)
for $j as integer in parallelize((1 to 10))
let $k as string := $j
return $k
