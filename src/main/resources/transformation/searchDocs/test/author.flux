default file = FLUX_DIR + "../data/author.xml";

file|
open-file|
decode-xml|
handle-marcxml|
morph(FLUX_DIR + "authorFrameMorph.xml")|
encode-json |
write("stdout");
