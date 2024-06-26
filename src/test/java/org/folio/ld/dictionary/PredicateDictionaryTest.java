package org.folio.ld.dictionary;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class PredicateDictionaryTest {

  @Test
  void fromNullUri_shouldContainNull() {
    // when
    var result = PredicateDictionary.fromUri(null);

    // then
    assertThat(result)
      .contains(PredicateDictionary.NULL)
      .map(PredicateDictionary::getUri)
      .isEmpty();
  }

  @ParameterizedTest
  @ValueSource(strings = {"", " ", "empty", "some source"})
  void fromUri_shouldNotContainValue(String uri) {
    // when
    var result = PredicateDictionary.fromUri(uri);

    // then
    assertThat(result)
      .isEmpty();
  }

  @ParameterizedTest
  @CsvSource(value = {
    "http://bibfra.me/vocab/relation/abridger, -1881553869633996375",
    "http://bibfra.me/vocab/marc/accessLocation, -7597340833248531885",
    "http://bibfra.me/vocab/relation/actor, -7889481340231538902",
    "http://bibfra.me/vocab/relation/adapter, -8117733697683451845",
    "http://bibfra.me/vocab/relation/addressee, 7146915898929324917",
    "http://bibfra.me/vocab/relation/analyst, -6191907305787265447",
    "http://bibfra.me/vocab/relation/animator, 7266714894947073750",
    "http://bibfra.me/vocab/relation/annotator, 396439005640087129",
    "http://bibfra.me/vocab/relation/appellant, -1031822432999417480",
    "http://bibfra.me/vocab/relation/appellee, -6154111677140904882",
    "http://bibfra.me/vocab/relation/applicant, 8668341231358239506",
    "http://bibfra.me/vocab/relation/appraiser, 6697999124730107913",
    "http://bibfra.me/vocab/relation/architect, -5187298832881904780",
    "http://bibfra.me/vocab/relation/arranger, -1015123707322615787",
    "http://bibfra.me/vocab/relation/arrangerofmusic, -7102400223873496580",
    "http://bibfra.me/vocab/relation/artcopyist, 6451652944925053619",
    "http://bibfra.me/vocab/relation/artdirector, -4985681577099479873",
    "http://bibfra.me/vocab/relation/artist, 2025290680856635684",
    "http://bibfra.me/vocab/relation/artisticdirector, 9135837527386068382",
    "http://bibfra.me/vocab/relation/assignee, 7405418968762623881",
    "http://bibfra.me/vocab/relation/associatedname, -67894146350435904",
    "http://bibfra.me/vocab/relation/attributedname, -7598221601699753655",
    "http://bibfra.me/vocab/relation/auctioneer, -90549438337700750",
    "http://bibfra.me/vocab/relation/author, -6596442569246316195",
    "http://bibfra.me/vocab/relation/authorinquotationsortextabstracts, 845611651626754918",
    "http://bibfra.me/vocab/relation/authorofafterwordcolophonetc, 2187317207457017971",
    "http://bibfra.me/vocab/relation/authorofdialog, -1710550181717354180",
    "http://bibfra.me/vocab/relation/authorofintroductionetc, -3572202151957826138",
    "http://bibfra.me/vocab/relation/authorofscreenplay, -7070714076146966635",
    "http://bibfra.me/vocab/relation/authorofscreenplayetc, 8003900681642774771",
    "http://bibfra.me/vocab/relation/autographer, 2750047086592944130",
    "http://bibfra.me/vocab/relation/bibliographicantecedent, -8591626665189334113",
    "http://bibfra.me/vocab/relation/binder, 7008041772313393195",
    "http://bibfra.me/vocab/relation/bindingdesigner, -7945942398203760590",
    "http://bibfra.me/vocab/relation/blurbwriter, 5066588154321208927",
    "http://bibfra.me/vocab/relation/bookdesigner, 1961385747155481542",
    "http://bibfra.me/vocab/relation/bookjacketdesigner, -4181805579359103343",
    "http://bibfra.me/vocab/relation/bookplatedesigner, 8272093477934622896",
    "http://bibfra.me/vocab/relation/bookproducer, -8737193169383472931",
    "http://bibfra.me/vocab/relation/bookseller, 6771008816420188393",
    "http://bibfra.me/vocab/relation/bowdlerizer, -1115976925519304608",
    "http://bibfra.me/vocab/relation/brailleembosser, 1042060857260105599",
    "http://bibfra.me/vocab/relation/broadcaster, 1668662396601273223",
    "http://bibfra.me/vocab/relation/calligrapher, -7115678944615000055",
    "http://bibfra.me/vocab/relation/cartographer, 2768620144246182545",
    "http://bibfra.me/vocab/marc/carrier, -8262298498902758692",
    "http://bibfra.me/vocab/relation/caster, -6078886147197735605",
    "http://bibfra.me/vocab/relation/censor, -8080576541209196144",
    "http://bibfra.me/vocab/relation/chiefelectrician, 860446494518367226",
    "http://bibfra.me/vocab/relation/choreographer, -5598956184563615348",
    "http://bibfra.me/vocab/relation/cinematographer, -240027286511794931",
    "http://bibfra.me/vocab/lite/classification, 554014919457463261",
    "http://bibfra.me/vocab/relation/client, 1991676167013052302",
    "http://bibfra.me/vocab/relation/collaborator, 8686379822497080414",
    "http://bibfra.me/vocab/relation/collectionregistrar, -5071801996237403310",
    "http://bibfra.me/vocab/relation/collector, -8924803615730675301",
    "http://bibfra.me/vocab/relation/collotyper, -7028224945645912604",
    "http://bibfra.me/vocab/relation/colorist, -8984428167413430432",
    "http://bibfra.me/vocab/relation/commentator, -3886611427667063792",
    "http://bibfra.me/vocab/relation/commentatorforwrittentext, -6893046510632448066",
    "http://bibfra.me/vocab/relation/compiler, -1288999030381720569",
    "http://bibfra.me/vocab/relation/committeechair, -6547696265264994012",
    "http://bibfra.me/vocab/relation/complainant, 9182048291393502325",
    "http://bibfra.me/vocab/relation/complainant-appellant, 8664794945403296116",
    "http://bibfra.me/vocab/relation/complainant-appellee, 194892386461845077",
    "http://bibfra.me/vocab/relation/composer, 3726424103025831138",
    "http://bibfra.me/vocab/relation/compositor, -5506320038854053813",
    "http://bibfra.me/vocab/relation/conceptor, 1175853197658756875",
    "http://bibfra.me/vocab/relation/conductor, -7561495592312028907",
    "http://bibfra.me/vocab/relation/conservator, 7565454730872954914",
    "http://bibfra.me/vocab/relation/consultant, 1941041144722791403",
    "http://bibfra.me/vocab/relation/consultanttoaproject, 1522472576395347545",
    "http://bibfra.me/vocab/marc/content, -8400837019789777596",
    "http://bibfra.me/vocab/relation/contestant, 4061974234819549209",
    "http://bibfra.me/vocab/relation/contestant-appellant, -399365167561297620",
    "http://bibfra.me/vocab/relation/contestant-appellee, 8495075689445737458",
    "http://bibfra.me/vocab/relation/contestee, 1175102703422739943",
    "http://bibfra.me/vocab/relation/contestee-appellant, 1142814501226022178",
    "http://bibfra.me/vocab/relation/contestee-appellee, -312526975769762238",
    "http://bibfra.me/vocab/relation/contractor, 9130820773890948849",
    "http://bibfra.me/vocab/lite/contributor, 6734473498479079135",
    "http://bibfra.me/vocab/relation/copier, -2609434858243537262",
    "http://bibfra.me/vocab/marc/copyright, -5763504959160201664",
    "http://bibfra.me/vocab/relation/copyrightholder, -6293895282543582669",
    "http://bibfra.me/vocab/relation/copyrightclaimant, -3777350583396209618",
    "http://bibfra.me/vocab/relation/corrector, -6065342485537308272",
    "http://bibfra.me/vocab/relation/correspondent, 7026733380493142487",
    "http://bibfra.me/vocab/relation/costumedesigner, 8679880042724052616",
    "http://bibfra.me/vocab/relation/counterfeiter, -2640022155516947285",
    "http://bibfra.me/vocab/relation/courtgoverned, -1179338308545581069",
    "http://bibfra.me/vocab/relation/courtreporter, -2449747459738415077",
    "http://bibfra.me/vocab/relation/coverdesigner, -7322513080240732546",
    "http://bibfra.me/vocab/lite/creator, -6427036973279413520",
    "http://bibfra.me/vocab/relation/curator, -3410780561323131602",
    "http://bibfra.me/vocab/relation/curatorofanexhibition, -5001086314628818784",
    "http://bibfra.me/vocab/relation/currentowner, -32865522482978703",
    "http://bibfra.me/vocab/relation/dancer, -25390995871791813",
    "http://bibfra.me/vocab/relation/datacontributor, -9216460846884124272",
    "http://bibfra.me/vocab/relation/datamanager, -4540200608348290833",
    "http://bibfra.me/vocab/relation/dedicatee, 6569578587805309707",
    "http://bibfra.me/vocab/relation/dedicateeofitem, -1744157191415334742",
    "http://bibfra.me/vocab/relation/dedicator, 6194662180414540416",
    "http://bibfra.me/vocab/relation/defendant, -2118970069007407129",
    "http://bibfra.me/vocab/relation/defendant-appellant, -8568757779300192066",
    "http://bibfra.me/vocab/relation/defendant-appellee, 5825042602638706047",
    "http://bibfra.me/vocab/relation/degreecommitteemember, 3002787100623600262",
    "http://bibfra.me/vocab/relation/degreegrantinginstitution, -6535280095788249831",
    "http://bibfra.me/vocab/relation/degreegrantor, -4726752083014898631",
    "http://bibfra.me/vocab/relation/degreesupervisor, 5939879124814669322",
    "http://bibfra.me/vocab/relation/delineator, -5496570211056974213",
    "http://bibfra.me/vocab/relation/depicted, 1660616192565544343",
    "http://bibfra.me/vocab/relation/deponent, 2600174086830167294",
    "http://bibfra.me/vocab/relation/designer, -8809035913482353358",
    "http://bibfra.me/vocab/relation/designerofbinding, 7005712464023543797",
    "http://bibfra.me/vocab/relation/designerofbook, 3892289607081961171",
    "http://bibfra.me/vocab/relation/designerofbookjacket, -7759016720787673597",
    "http://bibfra.me/vocab/relation/designerofcover, 5697476492487282552",
    "http://bibfra.me/vocab/relation/designerofebook, 8225691775601977569",
    "http://bibfra.me/vocab/relation/designeroftype, 4055319659898532694",
    "http://bibfra.me/vocab/relation/director, 4411059321402574622",
    "http://bibfra.me/vocab/relation/directorofphotography, -6810518439383634035",
    "http://bibfra.me/vocab/relation/dissertant, 4753594158950526023",
    "http://bibfra.me/vocab/relation/distributionplace, 3307427837881978525",
    "http://bibfra.me/vocab/relation/distributor, -6757449802313121000",
    "http://bibfra.me/vocab/relation/donor, -3819113466231579821",
    "http://bibfra.me/vocab/relation/dpt, 7798924609543313511",
    "http://bibfra.me/vocab/relation/draftsman, -2933290166347966898",
    "http://bibfra.me/vocab/relation/dubiousauthor, 6126316501987220338",
    "http://bibfra.me/vocab/relation/editor, -30623644524467588",
    "http://bibfra.me/vocab/relation/editorofcompilation, -6556175463993588890",
    "http://bibfra.me/vocab/relation/editorofmovingimagework, -8676844579259506459",
    "http://bibfra.me/vocab/relation/electrician, 1531976602600996772",
    "http://bibfra.me/vocab/relation/electrotyper, 389407578281985870",
    "http://bibfra.me/vocab/relation/enactingjurisdiction, -3545869386083736036",
    "http://bibfra.me/vocab/relation/encoder, -3013315038785040127",
    "http://bibfra.me/vocab/relation/engineer, -5001780330991034626",
    "http://bibfra.me/vocab/relation/engraver, 8259247786991666603",
    "http://bibfra.me/vocab/relation/etcher, 1115075999780718952",
    "http://bibfra.me/vocab/relation/eventplace, 3317594278505427534",
    "http://bibfra.me/vocab/relation/expert, 8936994285309227038",
    "http://bibfra.me/vocab/relation/expurgator, -9115691855201116956",
    "http://bibfra.me/vocab/relation/eyewitness, -5528585934167149587",
    "http://bibfra.me/vocab/relation/facsimilist, 6583566189663491430",
    "http://bibfra.me/vocab/relation/fielddirector, -3337808203520410550",
    "http://bibfra.me/vocab/relation/filmdirector, -3996044408521087130",
    "http://bibfra.me/vocab/relation/filmdistributor, 2605945402359269704",
    "http://bibfra.me/vocab/relation/filmeditor, -3861691215618967651",
    "http://bibfra.me/vocab/relation/filmmaker, -4671481447159246575",
    "http://bibfra.me/vocab/relation/filmproducer, -2990034226285743364",
    "http://bibfra.me/vocab/relation/firstparty, 6657644199418291297",
    "http://bibfra.me/vocab/lite/focus, 56570521968326884",
    "http://bibfra.me/vocab/relation/forger, 7983589711752821428",
    "http://bibfra.me/vocab/relation/formerowner, -5538768076085386314",
    "http://bibfra.me/vocab/relation/funder, -2047243937090523029",
    "http://bibfra.me/vocab/lite/genre, 4866975688890760085",
    "http://bibfra.me/vocab/marc/geographicCoverage, -8620033703628203389",
    "http://bibfra.me/vocab/relation/geographicinformationspecialist, 3508308357296568573",
    "http://bibfra.me/vocab/relation/geospatialinformationspecialist, 2173000748101332529",
    "http://bibfra.me/vocab/marc/governmentPublication, 8470378347721175903",
    "http://bibfra.me/vocab/relation/graphictechnician, -6950741445095654444",
    "http://bibfra.me/vocab/relation/honoree, -8991261641829130106",
    "http://bibfra.me/vocab/relation/honouree, 2120599989808973282",
    "http://bibfra.me/vocab/relation/honoureeofitem, -4557648830128662871",
    "http://bibfra.me/vocab/relation/host, -2519174129321051733",
    "http://bibfra.me/vocab/relation/hostinstitution, 9219886340324233688",
    "http://bibfra.me/vocab/relation/illuminator, -4531211150303374769",
    "http://bibfra.me/vocab/relation/illustrator, 4628703960360348505",
    "http://bibfra.me/vocab/relation/imprimatur, -4876791673033108366",
    "http://bibfra.me/vocab/relation/inscriber, 9006573419425565822",
    "http://bibfra.me/vocab/lite/instantiates, -5307605433297919406",
    "http://bibfra.me/vocab/relation/instructor, -8785766506269885242",
    "http://bibfra.me/vocab/relation/instrumentalist, -2326633724480687974",
    "http://bibfra.me/vocab/relation/interviewee, -1175175354014580390",
    "http://bibfra.me/vocab/relation/interviewer, -1434850621539835676",
    "http://bibfra.me/vocab/relation/inventor, 2360661655945154590",
    "http://bibfra.me/vocab/lite/isDefinedBy, 7957687350759571585",
    "http://bibfra.me/vocab/relation/issuingbody, 8791761742962649291",
    "http://bibfra.me/vocab/relation/jointauthor, 8080521624853626976",
    "http://bibfra.me/vocab/relation/judge, -7432803083318954618",
    "http://bibfra.me/vocab/relation/jurisdictiongoverned, 1534622387904186421",
    "http://bibfra.me/vocab/relation/labdirector, 4112090866120274808",
    "http://bibfra.me/vocab/relation/laboratory, -1466457007730911865",
    "http://bibfra.me/vocab/relation/laboratorydirector, 2061760390604321696",
    "http://bibfra.me/vocab/relation/landscapearchitect, 6581259477848129845",
    "http://bibfra.me/vocab/relation/lead, 126512046878743793",
    "http://bibfra.me/vocab/relation/lender, -701702796379354499",
    "http://bibfra.me/vocab/relation/libelant, 6154680848501125197",
    "http://bibfra.me/vocab/relation/libelant-appellant, 8844261560017941969",
    "http://bibfra.me/vocab/relation/libelant-appellee, 6505695995101291570",
    "http://bibfra.me/vocab/relation/libelee, 7936937375176225070",
    "http://bibfra.me/vocab/relation/libelee-appellant, -8623798510866830212",
    "http://bibfra.me/vocab/relation/libelee-appellee, -955582632560565472",
    "http://bibfra.me/vocab/relation/librettist, 8485271376451334232",
    "http://bibfra.me/vocab/relation/licensee, -5572426639013302800",
    "http://bibfra.me/vocab/relation/licensor, -8930001575160107139",
    "http://bibfra.me/vocab/relation/lightingdesigner, -2308175520295756415",
    "http://bibfra.me/vocab/relation/lithographer, 5897289586058487411",
    "http://bibfra.me/vocab/relation/lyricist, -5923020159488577905",
    "http://bibfra.me/vocab/relation/manufactureplace, 1841006756690465477",
    "http://bibfra.me/vocab/relation/manufacturer, -1932075079159873717",
    "http://library.link/vocab/map, 3538761499444069943",
    "http://bibfra.me/vocab/relation/marbler, -2811404676669047865",
    "http://bibfra.me/vocab/relation/markupeditor, 1688869189277424998",
    "http://bibfra.me/vocab/relation/masterelectrician, -2520333835109780309",
    "http://bibfra.me/vocab/marc/media, -1307538224118273019",
    "http://bibfra.me/vocab/relation/medium, 6197535173129003297",
    "http://bibfra.me/vocab/relation/metadatacontact, 6281239047482070545",
    "http://bibfra.me/vocab/relation/metal-engraver, -6839531685737300133",
    "http://bibfra.me/vocab/relation/minutetaker, -5505738037488947363",
    "http://bibfra.me/vocab/relation/moderator, -3242676903839655505",
    "http://bibfra.me/vocab/relation/monitor, -4633540018763888269",
    "http://bibfra.me/vocab/relation/motionpictureeditor, -8294713842605792769",
    "http://bibfra.me/vocab/relation/movingimageworkeditor, -6781422427155836878",
    "http://bibfra.me/vocab/relation/musicaldirector, 6238859733318403010",
    "http://bibfra.me/vocab/relation/musiccopyist, 1879421627065134261",
    "http://bibfra.me/vocab/relation/musician, -7682459573281827737",
    "http://bibfra.me/vocab/relation/narrator, 1302337897772550639",
    "http://bibfra.me/vocab/relation/observer, 5271821648824987827",
    "http://bibfra.me/vocab/relation/onlooker, -5916150565327806407",
    "http://bibfra.me/vocab/relation/onscreenpresenter, 8898946843623143208",
    "http://bibfra.me/vocab/relation/opponent, -2226274092248428595",
    "http://bibfra.me/vocab/relation/originator, -5006567038186364746",
    "http://bibfra.me/vocab/marc/originPlace, -9037756205158587499",
    "http://bibfra.me/vocab/relation/organizer, -6817269620826515946",
    "http://bibfra.me/vocab/relation/organizerofmeeting, -6032784390913849652",
    "http://bibfra.me/vocab/relation/other, -8343171522807366254",
    "http://bibfra.me/vocab/relation/owner, 3279772754392666910",
    "http://bibfra.me/vocab/relation/panelist, 7259665882613257391",
    "http://bibfra.me/vocab/relation/papermaker, 8110873117288631549",
    "http://bibfra.me/vocab/relation/patentapplicant, -4024462269205578024",
    "http://bibfra.me/vocab/relation/patentee, 3260017645870688901",
    "http://bibfra.me/vocab/relation/patentholder, -3830377425794172430",
    "http://bibfra.me/vocab/relation/patentinventor, 2871896342806465733",
    "http://bibfra.me/vocab/relation/patron, 8678602378809311094",
    "http://bibfra.me/vocab/marc/distribution, -448045113972492966",
    "http://bibfra.me/vocab/marc/manufacture, -2828753452541607170",
    "http://bibfra.me/vocab/marc/production, 2801478436215503730",
    "http://bibfra.me/vocab/marc/publication, 9018504469354013109",
    "http://bibfra.me/vocab/relation/performer, 362231791609598524",
    "http://bibfra.me/vocab/relation/performerofresearch, 3676027257094747810",
    "http://bibfra.me/vocab/relation/permittingagency, -25942544337387237",
    "http://bibfra.me/vocab/relation/photographer, -6844884043568858245",
    "http://bibfra.me/vocab/lite/place, -2442655877067158195",
    "http://bibfra.me/vocab/relation/plaintiff, -2057531612169211996",
    "http://bibfra.me/vocab/relation/plaintiff-appellee, -5383359863853820560",
    "http://bibfra.me/vocab/relation/plaintiff-appellant, 1057340563993139097",
    "http://bibfra.me/vocab/relation/platemaker, 1045816376140135949",
    "http://bibfra.me/vocab/relation/praeses, 8487605748246725441",
    "http://bibfra.me/vocab/relation/presenter, 4850714026611852927",
    "http://bibfra.me/vocab/relation/preservationist, 3639514918270445681",
    "http://bibfra.me/vocab/relation/printer, 8439821918851986354",
    "http://bibfra.me/vocab/relation/printerofplates, 9147898552683011136",
    "http://bibfra.me/vocab/relation/printmaker, 5096533604721015508",
    "http://bibfra.me/vocab/relation/processcontact, 7801771234616221723",
    "http://bibfra.me/vocab/relation/producer, 3807267290148672551",
    "http://bibfra.me/vocab/relation/producerofbook, 4818524251020957979",
    "http://bibfra.me/vocab/relation/productioncompany, -6439158309830834854",
    "http://bibfra.me/vocab/relation/productiondesigner, -5703147531389987469",
    "http://bibfra.me/vocab/relation/productionmanager, -7814586281243718599",
    "http://bibfra.me/vocab/relation/productionpersonnel, -4170933604092460187",
    "http://bibfra.me/vocab/relation/productionplace, 6607880012947321106",
    "http://bibfra.me/vocab/relation/programmer, -8044572619692866345",
    "http://bibfra.me/vocab/relation/projectdirector, -7396255891203097360",
    "http://bibfra.me/vocab/relation/promoter, -74651765016929084",
    "http://bibfra.me/vocab/relation/proofreader, -5989858639371564774",
    "http://bibfra.me/vocab/relation/provider, 425974361987333011",
    "http://bibfra.me/vocab/relation/publicationplace, 818158572578514285",
    "http://bibfra.me/vocab/relation/publisher, 5215852170498607477",
    "http://bibfra.me/vocab/relation/publishingdirector, -6950648437119746902",
    "http://bibfra.me/vocab/relation/puppeteer, -6224693515389885910",
    "http://bibfra.me/vocab/lite/providerPlace, -5991192843515972558",
    "http://bibfra.me/vocab/relation/radiodirector, -622689229165595394",
    "http://bibfra.me/vocab/relation/radioproducer, -3085194559719821167",
    "http://bibfra.me/vocab/relation/recipient, 5280382572521494315",
    "http://bibfra.me/vocab/relation/recordingengineer, -4256444195952617469",
    "http://bibfra.me/vocab/relation/recordist, 6293758429913050034",
    "http://bibfra.me/vocab/relation/redaktor, 5948826032568027805",
    "http://bibfra.me/vocab/relation/renderer, 1839461985692658837",
    "http://bibfra.me/vocab/relation/reporter, 3290716209453871658",
    "http://bibfra.me/vocab/relation/repository, -903688941500629268",
    "http://bibfra.me/vocab/relation/researcher, -3440403871055227632",
    "http://bibfra.me/vocab/relation/researchteamhead, -8744505428381881429",
    "http://bibfra.me/vocab/relation/researchteammember, 721871278891849544",
    "http://bibfra.me/vocab/relation/respondent, -4059032642225334161",
    "http://bibfra.me/vocab/relation/respondent-appellant, -4946382629987149582",
    "http://bibfra.me/vocab/relation/respondent-appellee, 6477001062586442868",
    "http://bibfra.me/vocab/relation/responsibleparty, 1920836323803076865",
    "http://bibfra.me/vocab/relation/restager, 4056195569947754779",
    "http://bibfra.me/vocab/relation/restorationist, 3532511322675178786",
    "http://bibfra.me/vocab/relation/rubricator, 2291576756454189488",
    "http://bibfra.me/vocab/relation/reviewer, 1485937185457850020",
    "http://bibfra.me/vocab/relation/secondparty, -8637297818295477357",
    "http://bibfra.me/vocab/relation/secretary, 7970510386449698064",
    "http://bibfra.me/vocab/relation/seller, -3826122662890180564",
    "http://bibfra.me/vocab/relation/setdesigner, -8873486006515554683",
    "http://bibfra.me/vocab/relation/setting, -6076131602023710564",
    "http://bibfra.me/vocab/relation/scenarist, 4955279007441455427",
    "http://bibfra.me/vocab/relation/scientificadvisor, -5182326538908172193",
    "http://bibfra.me/vocab/relation/screenwriter, 4396431280014899925",
    "http://bibfra.me/vocab/relation/scribe, -194395883101964127",
    "http://bibfra.me/vocab/relation/sculptor, -8331553470630418732",
    "http://bibfra.me/vocab/relation/signer, -5659593943230231117",
    "http://bibfra.me/vocab/relation/singer, -8100714858702474147",
    "http://bibfra.me/vocab/relation/sounddesigner, 5782680873497730492",
    "http://bibfra.me/vocab/relation/speaker, -3497492061023599002",
    "http://bibfra.me/vocab/relation/sponsor, 7574920524492424023",
    "http://bibfra.me/vocab/relation/sponsoringbody, -3987196165485327078",
    "http://bibfra.me/vocab/relation/stagedirector, -6520693599871274499",
    "http://bibfra.me/vocab/relation/stagemanager, -4849940007981862806",
    "http://bibfra.me/vocab/relation/standardsbody, 3206212494297054898",
    "http://bibfra.me/vocab/marc/status, -6334780726339225629",
    "http://bibfra.me/vocab/relation/stereotyper, -4502416938698558845",
    "http://bibfra.me/vocab/relation/storyteller, -37590166610848390",
    "http://bibfra.me/vocab/lite/subFocus, 4520390776619819950",
    "http://bibfra.me/vocab/lite/subject, -2239094214354783649",
    "http://bibfra.me/vocab/marc/supplementaryContent, 3590710019304603200",
    "http://bibfra.me/vocab/relation/supportinghost, -1366677099949474426",
    "http://bibfra.me/vocab/relation/supposedname, 8102844602830084573",
    "http://bibfra.me/vocab/relation/surveyor, 4252294449481960150",
    "http://bibfra.me/vocab/marc/targetAudience, -2457879742170133289",
    "http://bibfra.me/vocab/relation/teacher, 8090105527174445881",
    "http://bibfra.me/vocab/relation/technicaldirector, 8062534342751234140",
    "http://bibfra.me/vocab/relation/technicaldraftsman, -1223904927709061301",
    "http://bibfra.me/vocab/relation/televisiondirector, 671244920389203906",
    "http://bibfra.me/vocab/relation/televisionproducer, -1312916459698215860",
    "http://bibfra.me/vocab/relation/testifier, 7654251518522604176",
    "http://bibfra.me/vocab/relation/thesisadvisor, -436488805304829656",
    "http://bibfra.me/vocab/marc/title, 5549969427228480763",
    "http://bibfra.me/vocab/relation/transcriber, 3044321849303393696",
    "http://bibfra.me/vocab/relation/translator, 8239555690967754519",
    "http://bibfra.me/vocab/relation/typedesigner, 302801695981321882",
    "http://bibfra.me/vocab/relation/typesetter, 8738729976916283305",
    "http://bibfra.me/vocab/relation/typographer, -20117635990603638",
    "http://bibfra.me/vocab/relation/universityplace, 1303817577775111030",
    "http://bibfra.me/vocab/relation/videographer, 8031651173766527370",
    "http://bibfra.me/vocab/relation/vocalist, 8910296023610750018",
    "http://bibfra.me/vocab/relation/voiceactor, -1832633683761829384",
    "http://bibfra.me/vocab/relation/witness, 8411575926066624630",
    "http://bibfra.me/vocab/relation/woodcutter, -4840000431932639842",
    "http://bibfra.me/vocab/relation/woodengraver, 8909041328074104450",
    "http://bibfra.me/vocab/relation/writerofaccompanyingmaterial, 7579191353863606826",
    "http://bibfra.me/vocab/relation/writerofaddedcommentary, -2412026668923962905",
    "http://bibfra.me/vocab/relation/writerofaddedlyrics, -4848817620112009764",
    "http://bibfra.me/vocab/relation/writerofaddedtext, -5185983783550361401",
    "http://bibfra.me/vocab/relation/writerofintroduction, 4607391205879850026",
    "http://bibfra.me/vocab/relation/writerofpreface, 9149316539704131621",
    "http://bibfra.me/vocab/relation/writerofsupplementarytextualcontent, -3238519940427998803",
  })
  void fromUri_shouldContainValue(String uri, Long hash) {
    //when
    var predicate = PredicateDictionary.fromUri(uri);

    //then
    assertThat(predicate)
      .isNotNull()
      .map(PredicateDictionary::getHash)
      .contains(hash);
  }

}
