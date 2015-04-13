//default file = FLUX_DIR + "data/correctMarcXML.xml";
default file = FLUX_DIR + "data/classif_912.xml";

file|
open-file|
decode-xml|
handle-marcxml|
morph(FLUX_DIR + "transform2SearchDoc.xml")|
//encode-formeta |
encode-json |
write("stdout");
