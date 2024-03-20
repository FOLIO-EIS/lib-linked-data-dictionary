package org.folio.ld.dictionary;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import lombok.Getter;
import org.folio.ld.dictionary.model.Predicate;
import org.folio.ld.dictionary.util.HashUtils;

@Getter
public enum PredicateDictionary implements Predicate {
  NULL(null),
  ABRIDGER("http://bibfra.me/vocab/relation/abridger"),
  ACCESS_LOCATION("http://bibfra.me/vocab/marc/accessLocation"),
  ACTOR("http://bibfra.me/vocab/relation/actor"),
  ADAPTER("http://bibfra.me/vocab/relation/adapter"),
  ADDRESSEE("http://bibfra.me/vocab/relation/addressee"),
  ANALYST("http://bibfra.me/vocab/relation/analyst"),
  ANIMATOR("http://bibfra.me/vocab/relation/animator"),
  ANNOTATOR("http://bibfra.me/vocab/relation/annotator"),
  APPELLANT("http://bibfra.me/vocab/relation/appellant"),
  APPELLEE("http://bibfra.me/vocab/relation/appellee"),
  APPLICANT("http://bibfra.me/vocab/relation/applicant"),
  APPRAISER("http://bibfra.me/vocab/relation/appraiser"),
  ARCHITECT("http://bibfra.me/vocab/relation/architect"),
  ARRANGER("http://bibfra.me/vocab/relation/arranger"),
  ARRANGER_OF_MUSIC("http://bibfra.me/vocab/relation/arrangerofmusic"),
  ART_COPYIST("http://bibfra.me/vocab/relation/artcopyist"),
  ART_DIRECTOR("http://bibfra.me/vocab/relation/artdirector"),
  ARTIST("http://bibfra.me/vocab/relation/artist"),
  ARTISTIC_DIRECTOR("http://bibfra.me/vocab/relation/artisticdirector"),
  ASSIGNEE("http://bibfra.me/vocab/relation/assignee"),
  ASSOCIATED_NAME("http://bibfra.me/vocab/relation/associatedname"),
  ATTRIBUTED_NAME("http://bibfra.me/vocab/relation/attributedname"),
  AUCTIONEER("http://bibfra.me/vocab/relation/auctioneer"),
  AUTHOR("http://bibfra.me/vocab/relation/author"),
  AUTHOR_IN_QUOTATIONS_OR_TEXT_ABSTRACTS("http://bibfra.me/vocab/relation/authorinquotationsortextabstracts"),
  AUTHOR_OF_AFTERWORD_COLOPHON_ETC("http://bibfra.me/vocab/relation/authorofafterwordcolophonetc"),
  AUTHOR_OF_DIALOG("http://bibfra.me/vocab/relation/authorofdialog"),
  AUTHOR_OF_INTRODUCTION_ETC("http://bibfra.me/vocab/relation/authorofintroductionetc"),
  AUTHOR_OF_SCREENPLAY("http://bibfra.me/vocab/relation/authorofscreenplay"),
  AUTHOR_OF_SCREENPLAY_ETC("http://bibfra.me/vocab/relation/authorofscreenplayetc"),
  AUTOGRAPHER("http://bibfra.me/vocab/relation/autographer"),
  BIBLIOGRAPHIC_ANTECEDENT("http://bibfra.me/vocab/relation/bibliographicantecedent"),
  BINDER("http://bibfra.me/vocab/relation/binder"),
  BINDING_DESIGNER("http://bibfra.me/vocab/relation/bindingdesigner"),
  BLURB_WRITER("http://bibfra.me/vocab/relation/blurbwriter"),
  BOOK_DESIGNER("http://bibfra.me/vocab/relation/bookdesigner"),
  BOOK_JACKET_DESIGNER("http://bibfra.me/vocab/relation/bookjacketdesigner"),
  BOOK_PLATE_DESIGNER("http://bibfra.me/vocab/relation/bookplatedesigner"),
  BOOK_PRODUCER("http://bibfra.me/vocab/relation/bookproducer"),
  BOOK_SELLER("http://bibfra.me/vocab/relation/bookseller"),
  BOWDLERIZER("http://bibfra.me/vocab/relation/bowdlerizer"),
  BRAILLE_EMBOSSER("http://bibfra.me/vocab/relation/brailleembosser"),
  BROADCASTER("http://bibfra.me/vocab/relation/broadcaster"),
  CALLIGRAPHER("http://bibfra.me/vocab/relation/calligrapher"),
  CARTOGRAPHER("http://bibfra.me/vocab/relation/cartographer"),
  CARRIER("http://bibfra.me/vocab/marc/carrier"),
  CASTER("http://bibfra.me/vocab/relation/caster"),
  CENSOR("http://bibfra.me/vocab/relation/censor"),
  CHIEF_ELECTRICIAN("http://bibfra.me/vocab/relation/chiefelectrician"),
  CHOREOGRAPHER("http://bibfra.me/vocab/relation/choreographer"),
  CINEMATOGRAPHER("http://bibfra.me/vocab/relation/cinematographer"),
  CLASSIFICATION("http://bibfra.me/vocab/lite/classification"),
  CLIENT("http://bibfra.me/vocab/relation/client"),
  COLLABORATOR("http://bibfra.me/vocab/relation/collaborator"),
  COLLECTION_REGISTRAR("http://bibfra.me/vocab/relation/collectionregistrar"),
  COLLECTOR("http://bibfra.me/vocab/relation/collector"),
  COLLOTYPER("http://bibfra.me/vocab/relation/collotyper"),
  COLORIST("http://bibfra.me/vocab/relation/colorist"),
  COMMENTATOR("http://bibfra.me/vocab/relation/commentator"),
  COMMENTATOR_FOR_WRITTEN_TEXT("http://bibfra.me/vocab/relation/commentatorforwrittentext"),
  COMPILER("http://bibfra.me/vocab/relation/compiler"),
  COMMITTEE_CHAIR("http://bibfra.me/vocab/relation/committeechair"),
  COMPLAINANT("http://bibfra.me/vocab/relation/complainant"),
  COMPLAINANT_APPELLANT("http://bibfra.me/vocab/relation/complainant-appellant"),
  COMPLAINANT_APPELLEE("http://bibfra.me/vocab/relation/complainant-appellee"),
  COMPOSER("http://bibfra.me/vocab/relation/composer"),
  COMPOSITOR("http://bibfra.me/vocab/relation/compositor"),
  CONCEPTOR("http://bibfra.me/vocab/relation/conceptor"),
  CONDUCTOR("http://bibfra.me/vocab/relation/conductor"),
  CONSERVATOR("http://bibfra.me/vocab/relation/conservator"),
  CONSULTANT("http://bibfra.me/vocab/relation/consultant"),
  CONSULTANT_TO_A_PROJECT("http://bibfra.me/vocab/relation/consultanttoaproject"),
  CONTENT("http://bibfra.me/vocab/marc/content"),
  CONTESTANT("http://bibfra.me/vocab/relation/contestant"),
  CONTESTANT_APPELLANT("http://bibfra.me/vocab/relation/contestant-appellant"),
  CONTESTANT_APPELLEE("http://bibfra.me/vocab/relation/contestant-appellee"),
  CONTESTEE("http://bibfra.me/vocab/relation/contestee"),
  CONTESTEE_APPELLANT("http://bibfra.me/vocab/relation/contestee-appellant"),
  CONTESTEE_APPELLEE("http://bibfra.me/vocab/relation/contestee-appellee"),
  CONTRACTOR("http://bibfra.me/vocab/relation/contractor"),
  CONTRIBUTOR("http://bibfra.me/vocab/lite/contributor"),
  COPIER("http://bibfra.me/vocab/relation/copier"),
  COPYRIGHT("http://bibfra.me/vocab/marc/copyright"),
  COPYRIGHT_HOLDER("http://bibfra.me/vocab/relation/copyrightholder"),
  COPYRIGHT_CLAIMANT("http://bibfra.me/vocab/relation/copyrightclaimant"),
  CORRECTOR("http://bibfra.me/vocab/relation/corrector"),
  CORRESPONDENT("http://bibfra.me/vocab/relation/correspondent"),
  COSTUME_DESIGNER("http://bibfra.me/vocab/relation/costumedesigner"),
  COUNTERFEITER("http://bibfra.me/vocab/relation/counterfeiter"),
  COURT_GOVERNED("http://bibfra.me/vocab/relation/courtgoverned"),
  COURT_REPORTER("http://bibfra.me/vocab/relation/courtreporter"),
  COVER_DESIGNER("http://bibfra.me/vocab/relation/coverdesigner"),
  CREATOR("http://bibfra.me/vocab/lite/creator"),
  CURATOR("http://bibfra.me/vocab/relation/curator"),
  CURATOR_OF_AN_EXHIBITION("http://bibfra.me/vocab/relation/curatorofanexhibition"),
  CURRENT_OWNER("http://bibfra.me/vocab/relation/currentowner"),
  DANCER("http://bibfra.me/vocab/relation/dancer"),
  DATA_CONTRIBUTOR("http://bibfra.me/vocab/relation/datacontributor"),
  DATA_MANAGER("http://bibfra.me/vocab/relation/datamanager"),
  DEDICATEE("http://bibfra.me/vocab/relation/dedicatee"),
  DEDICATEE_OF_ITEM("http://bibfra.me/vocab/relation/dedicateeofitem"),
  DEDICATOR("http://bibfra.me/vocab/relation/dedicator"),
  DEFENDANT("http://bibfra.me/vocab/relation/defendant"),
  DEFENDANT_APPELLANT("http://bibfra.me/vocab/relation/defendant-appellant"),
  DEFENDANT_APPELLEE("http://bibfra.me/vocab/relation/defendant-appellee"),
  DEGREE_COMMITTEE_MEMBER("http://bibfra.me/vocab/relation/degreecommitteemember"),
  DEGREE_GRANTING_INSTITUTION("http://bibfra.me/vocab/relation/degreegrantinginstitution"),
  DEGREE_GRANTOR("http://bibfra.me/vocab/relation/degreegrantor"),
  DEGREE_SUPERVISOR("http://bibfra.me/vocab/relation/degreesupervisor"),
  DELINEATOR("http://bibfra.me/vocab/relation/delineator"),
  DEPICTED("http://bibfra.me/vocab/relation/depicted"),
  DEPONENT("http://bibfra.me/vocab/relation/deponent"),
  DESIGNER("http://bibfra.me/vocab/relation/designer"),
  DESIGNER_OF_BINDING("http://bibfra.me/vocab/relation/designerofbinding"),
  DESIGNER_OF_BOOK("http://bibfra.me/vocab/relation/designerofbook"),
  DESIGNER_OF_BOOK_JACKET("http://bibfra.me/vocab/relation/designerofbookjacket"),
  DESIGNER_OF_COVER("http://bibfra.me/vocab/relation/designerofcover"),
  DESIGNER_OF_EBOOK("http://bibfra.me/vocab/relation/designerofebook"),
  DESIGNER_OF_TYPE("http://bibfra.me/vocab/relation/designeroftype"),
  DIRECTOR("http://bibfra.me/vocab/relation/director"),
  DIRECTOR_OF_PHOTOGRAPHY("http://bibfra.me/vocab/relation/directorofphotography"),
  DISSERTANT("http://bibfra.me/vocab/relation/dissertant"),
  DISTRIBUTION_PLACE("http://bibfra.me/vocab/relation/distributionplace"),
  DISTRIBUTOR("http://bibfra.me/vocab/relation/distributor"),
  DONOR("http://bibfra.me/vocab/relation/donor"),
  DPT("http://bibfra.me/vocab/relation/dpt"),
  DRAFTSMAN("http://bibfra.me/vocab/relation/draftsman"),
  DUBIOUS_AUTHOR("http://bibfra.me/vocab/relation/dubiousauthor"),
  EDITOR("http://bibfra.me/vocab/relation/editor"),
  EDITOR_OF_COMPILATION("http://bibfra.me/vocab/relation/editorofcompilation"),
  EDITOR_OF_MOVING_IMAGE_WORK("http://bibfra.me/vocab/relation/editorofmovingimagework"),
  ELECTRICIAN("http://bibfra.me/vocab/relation/electrician"),
  ELECTRO_TYPER("http://bibfra.me/vocab/relation/electrotyper"),
  ENACTING_JURISDICTION("http://bibfra.me/vocab/relation/enactingjurisdiction"),
  ENCODER("http://bibfra.me/vocab/relation/encoder"),
  ENGINEER("http://bibfra.me/vocab/relation/engineer"),
  ENGRAVER("http://bibfra.me/vocab/relation/engraver"),
  ETCHER("http://bibfra.me/vocab/relation/etcher"),
  EVENT_PLACE("http://bibfra.me/vocab/relation/eventplace"),
  EXPERT("http://bibfra.me/vocab/relation/expert"),
  EXPURGATOR("http://bibfra.me/vocab/relation/expurgator"),
  EYEWITNESS("http://bibfra.me/vocab/relation/eyewitness"),
  FACSIMILIST("http://bibfra.me/vocab/relation/facsimilist"),
  FIELD_DIRECTOR("http://bibfra.me/vocab/relation/fielddirector"),
  FILM_DIRECTOR("http://bibfra.me/vocab/relation/filmdirector"),
  FILM_DISTRIBUTOR("http://bibfra.me/vocab/relation/filmdistributor"),
  FILM_EDITOR("http://bibfra.me/vocab/relation/filmeditor"),
  FILMMAKER("http://bibfra.me/vocab/relation/filmmaker"),
  FILM_PRODUCER("http://bibfra.me/vocab/relation/filmproducer"),
  FIRST_PARTY("http://bibfra.me/vocab/relation/firstparty"),
  FOCUS("http://bibfra.me/vocab/lite/focus"),
  FORGER("http://bibfra.me/vocab/relation/forger"),
  FORMER_OWNER("http://bibfra.me/vocab/relation/formerowner"),
  FUNDER("http://bibfra.me/vocab/relation/funder"),
  GENRE("http://bibfra.me/vocab/lite/genre"),
  GEOGRAPHIC_COVERAGE("http://bibfra.me/vocab/marc/geographicCoverage"),
  GEOGRAPHIC_INFORMATION_SPECIALIST("http://bibfra.me/vocab/relation/geographicinformationspecialist"),
  GEOSPATIAL_INFORMATION_SPECIALIST("http://bibfra.me/vocab/relation/geospatialinformationspecialist"),
  GOVERNMENT_PUBLICATION("http://bibfra.me/vocab/marc/governmentPublication"),
  GRAPHIC_TECHNICIAN("http://bibfra.me/vocab/relation/graphictechnician"),
  HONOREE("http://bibfra.me/vocab/relation/honoree"),
  HONOUREE("http://bibfra.me/vocab/relation/honouree"),
  HONOUREE_OF_ITEM("http://bibfra.me/vocab/relation/honoureeofitem"),
  HOST("http://bibfra.me/vocab/relation/host"),
  HOST_INSTITUTION("http://bibfra.me/vocab/relation/hostinstitution"),
  ILLUMINATOR("http://bibfra.me/vocab/relation/illuminator"),
  ILLUSTRATOR("http://bibfra.me/vocab/relation/illustrator"),
  IMPRIMATUR("http://bibfra.me/vocab/relation/imprimatur"),
  INSCRIBER("http://bibfra.me/vocab/relation/inscriber"),
  INSTANTIATES("http://bibfra.me/vocab/lite/instantiates"),
  INSTRUCTOR("http://bibfra.me/vocab/relation/instructor"),
  INSTRUMENTALIST("http://bibfra.me/vocab/relation/instrumentalist"),
  INTERVIEWEE("http://bibfra.me/vocab/relation/interviewee"),
  INTERVIEWER("http://bibfra.me/vocab/relation/interviewer"),
  INVENTOR("http://bibfra.me/vocab/relation/inventor"),
  IS_DEFINED_BY("http://bibfra.me/vocab/lite/isDefinedBy"),
  ISSUING_BODY("http://bibfra.me/vocab/relation/issuingbody"),
  JOINT_AUTHOR("http://bibfra.me/vocab/relation/jointauthor"),
  JUDGE("http://bibfra.me/vocab/relation/judge"),
  JURISDICTION_GOVERNED("http://bibfra.me/vocab/relation/jurisdictiongoverned"),
  LAB_DIRECTOR("http://bibfra.me/vocab/relation/labdirector"),
  LABORATORY("http://bibfra.me/vocab/relation/laboratory"),
  LABORATORY_DIRECTOR("http://bibfra.me/vocab/relation/laboratorydirector"),
  LANDSCAPE_ARCHITECT("http://bibfra.me/vocab/relation/landscapearchitect"),
  LEAD("http://bibfra.me/vocab/relation/lead"),
  LENDER("http://bibfra.me/vocab/relation/lender"),
  LIBELANT("http://bibfra.me/vocab/relation/libelant"),
  LIBELANT_APPELLANT("http://bibfra.me/vocab/relation/libelant-appellant"),
  LIBELANT_APPELLEE("http://bibfra.me/vocab/relation/libelant-appellee"),
  LIBELEE("http://bibfra.me/vocab/relation/libelee"),
  LIBELEE_APPELLANT("http://bibfra.me/vocab/relation/libelee-appellant"),
  LIBELEE_APPELLEE("http://bibfra.me/vocab/relation/libelee-appellee"),
  LIBRETTIST("http://bibfra.me/vocab/relation/librettist"),
  LICENSEE("http://bibfra.me/vocab/relation/licensee"),
  LICENSOR("http://bibfra.me/vocab/relation/licensor"),
  LIGHTING_DESIGNER("http://bibfra.me/vocab/relation/lightingdesigner"),
  LITHOGRAPHER("http://bibfra.me/vocab/relation/lithographer"),
  LYRICIST("http://bibfra.me/vocab/relation/lyricist"),
  MANUFACTURE_PLACE("http://bibfra.me/vocab/relation/manufactureplace"),
  MANUFACTURER("http://bibfra.me/vocab/relation/manufacturer"),
  MAP("http://library.link/vocab/map"),
  MARBLER("http://bibfra.me/vocab/relation/marbler"),
  MARKUP_EDITOR("http://bibfra.me/vocab/relation/markupeditor"),
  MASTER_ELECTRICIAN("http://bibfra.me/vocab/relation/masterelectrician"),
  MEDIA("http://bibfra.me/vocab/marc/media"),
  MEDIUM("http://bibfra.me/vocab/relation/medium"),
  METADATA_CONTACT("http://bibfra.me/vocab/relation/metadatacontact"),
  METAL_ENGRAVER("http://bibfra.me/vocab/relation/metal-engraver"),
  MINUTE_TAKER("http://bibfra.me/vocab/relation/minutetaker"),
  MODERATOR("http://bibfra.me/vocab/relation/moderator"),
  MONITOR("http://bibfra.me/vocab/relation/monitor"),
  MOTION_PICTURE_EDITOR("http://bibfra.me/vocab/relation/motionpictureeditor"),
  MOVING_IMAGE_WORK_EDITOR("http://bibfra.me/vocab/relation/movingimageworkeditor"),
  MUSICAL_DIRECTOR("http://bibfra.me/vocab/relation/musicaldirector"),
  MUSIC_COPYIST("http://bibfra.me/vocab/relation/musiccopyist"),
  MUSICIAN("http://bibfra.me/vocab/relation/musician"),
  NARRATOR("http://bibfra.me/vocab/relation/narrator"),
  OBSERVER("http://bibfra.me/vocab/relation/observer"),
  ONLOOKER("http://bibfra.me/vocab/relation/onlooker"),
  ONSCREEN_PRESENTER("http://bibfra.me/vocab/relation/onscreenpresenter"),
  OPPONENT("http://bibfra.me/vocab/relation/opponent"),
  ORIGINATOR("http://bibfra.me/vocab/relation/originator"),
  ORGANIZER("http://bibfra.me/vocab/relation/organizer"),
  ORGANIZER_OF_MEETING("http://bibfra.me/vocab/relation/organizerofmeeting"),
  OTHER("http://bibfra.me/vocab/relation/other"),
  OWNER("http://bibfra.me/vocab/relation/owner"),
  PANELIST("http://bibfra.me/vocab/relation/panelist"),
  PAPER_MAKER("http://bibfra.me/vocab/relation/papermaker"),
  PATENT_APPLICANT("http://bibfra.me/vocab/relation/patentapplicant"),
  PATENTEE("http://bibfra.me/vocab/relation/patentee"),
  PATENT_HOLDER("http://bibfra.me/vocab/relation/patentholder"),
  PATENT_INVENTOR("http://bibfra.me/vocab/relation/patentinventor"),
  PATRON("http://bibfra.me/vocab/relation/patron"),
  PE_DISTRIBUTION("http://bibfra.me/vocab/marc/distribution"),
  PE_MANUFACTURE("http://bibfra.me/vocab/marc/manufacture"),
  PE_PRODUCTION("http://bibfra.me/vocab/marc/production"),
  PE_PUBLICATION("http://bibfra.me/vocab/marc/publication"),
  PERFORMER("http://bibfra.me/vocab/relation/performer"),
  PERFORMER_OF_RESEARCH("http://bibfra.me/vocab/relation/performerofresearch"),
  PERMITTING_AGENCY("http://bibfra.me/vocab/relation/permittingagency"),
  PHOTOGRAPHER("http://bibfra.me/vocab/relation/photographer"),
  PLACE("http://bibfra.me/vocab/lite/place"),
  PLAINTIFF("http://bibfra.me/vocab/relation/plaintiff"),
  PLAINTIFF_APPELLEE("http://bibfra.me/vocab/relation/plaintiff-appellee"),
  PLAINTIFF_APPELLANT("http://bibfra.me/vocab/relation/plaintiff-appellant"),
  PLATE_MAKER("http://bibfra.me/vocab/relation/platemaker"),
  PRAESES("http://bibfra.me/vocab/relation/praeses"),
  PRESENTER("http://bibfra.me/vocab/relation/presenter"),
  PRESERVATIONIST("http://bibfra.me/vocab/relation/preservationist"),
  PRINTER("http://bibfra.me/vocab/relation/printer"),
  PRINTER_OF_PLATES("http://bibfra.me/vocab/relation/printerofplates"),
  PRINT_MAKER("http://bibfra.me/vocab/relation/printmaker"),
  PROCESS_CONTACT("http://bibfra.me/vocab/relation/processcontact"),
  PRODUCER("http://bibfra.me/vocab/relation/producer"),
  PRODUCER_OF_BOOK("http://bibfra.me/vocab/relation/producerofbook"),
  PRODUCTION_COMPANY("http://bibfra.me/vocab/relation/productioncompany"),
  PRODUCTION_DESIGNER("http://bibfra.me/vocab/relation/productiondesigner"),
  PRODUCTION_MANAGER("http://bibfra.me/vocab/relation/productionmanager"),
  PRODUCTION_PERSONNEL("http://bibfra.me/vocab/relation/productionpersonnel"),
  PRODUCTION_PLACE("http://bibfra.me/vocab/relation/productionplace"),
  PROGRAMMER("http://bibfra.me/vocab/relation/programmer"),
  PROJECT_DIRECTOR("http://bibfra.me/vocab/relation/projectdirector"),
  PROMOTER("http://bibfra.me/vocab/relation/promoter"),
  PROOFREADER("http://bibfra.me/vocab/relation/proofreader"),
  PROVIDER("http://bibfra.me/vocab/relation/provider"),
  PUBLICATION_PLACE("http://bibfra.me/vocab/relation/publicationplace"),
  PUBLISHER("http://bibfra.me/vocab/relation/publisher"),
  PUBLISHING_DIRECTOR("http://bibfra.me/vocab/relation/publishingdirector"),
  PUPPETEER("http://bibfra.me/vocab/relation/puppeteer"),
  PROVIDER_PLACE("http://bibfra.me/vocab/lite/providerPlace"),
  RADIO_DIRECTOR("http://bibfra.me/vocab/relation/radiodirector"),
  RADIO_PRODUCER("http://bibfra.me/vocab/relation/radioproducer"),
  RECIPIENT("http://bibfra.me/vocab/relation/recipient"),
  RECORDING_ENGINEER("http://bibfra.me/vocab/relation/recordingengineer"),
  RECORDIST("http://bibfra.me/vocab/relation/recordist"),
  REDAKTOR("http://bibfra.me/vocab/relation/redaktor"),
  RENDERER("http://bibfra.me/vocab/relation/renderer"),
  REPORTER("http://bibfra.me/vocab/relation/reporter"),
  REPOSITORY("http://bibfra.me/vocab/relation/repository"),
  RESEARCHER("http://bibfra.me/vocab/relation/researcher"),
  RESEARCH_TEAM_HEAD("http://bibfra.me/vocab/relation/researchteamhead"),
  RESEARCH_TEAM_MEMBER("http://bibfra.me/vocab/relation/researchteammember"),
  RESPONDENT("http://bibfra.me/vocab/relation/respondent"),
  RESPONDENT_APPELLANT("http://bibfra.me/vocab/relation/respondent-appellant"),
  RESPONDENT_APPELLEE("http://bibfra.me/vocab/relation/respondent-appellee"),
  RESPONSIBLE_PARTY("http://bibfra.me/vocab/relation/responsibleparty"),
  RESTAGER("http://bibfra.me/vocab/relation/restager"),
  RESTORATIONIST("http://bibfra.me/vocab/relation/restorationist"),
  RUBRICATOR("http://bibfra.me/vocab/relation/rubricator"),
  REVIEWER("http://bibfra.me/vocab/relation/reviewer"),
  SECOND_PARTY("http://bibfra.me/vocab/relation/secondparty"),
  SECRETARY("http://bibfra.me/vocab/relation/secretary"),
  SELLER("http://bibfra.me/vocab/relation/seller"),
  SET_DESIGNER("http://bibfra.me/vocab/relation/setdesigner"),
  SETTING("http://bibfra.me/vocab/relation/setting"),
  SCENARIST("http://bibfra.me/vocab/relation/scenarist"),
  SCIENTIFIC_ADVISOR("http://bibfra.me/vocab/relation/scientificadvisor"),
  SCREENWRITER("http://bibfra.me/vocab/relation/screenwriter"),
  SCRIBE("http://bibfra.me/vocab/relation/scribe"),
  SCULPTOR("http://bibfra.me/vocab/relation/sculptor"),
  SIGNER("http://bibfra.me/vocab/relation/signer"),
  SINGER("http://bibfra.me/vocab/relation/singer"),
  SOUND_DESIGNER("http://bibfra.me/vocab/relation/sounddesigner"),
  SPEAKER("http://bibfra.me/vocab/relation/speaker"),
  SPONSOR("http://bibfra.me/vocab/relation/sponsor"),
  SPONSORING_BODY("http://bibfra.me/vocab/relation/sponsoringbody"),
  STAGE_DIRECTOR("http://bibfra.me/vocab/relation/stagedirector"),
  STAGE_MANAGER("http://bibfra.me/vocab/relation/stagemanager"),
  STANDARDS_BODY("http://bibfra.me/vocab/relation/standardsbody"),
  STATUS("http://bibfra.me/vocab/marc/status"),
  STEREOTYPER("http://bibfra.me/vocab/relation/stereotyper"),
  STORYTELLER("http://bibfra.me/vocab/relation/storyteller"),
  SUB_FOCUS("http://bibfra.me/vocab/lite/subFocus"),
  SUBJECT("http://bibfra.me/vocab/lite/subject"),
  SUPPLEMENTARY_CONTENT("http://bibfra.me/vocab/marc/supplementaryContent"),
  SUPPORTING_HOST("http://bibfra.me/vocab/relation/supportinghost"),
  SUPPOSED_NAME("http://bibfra.me/vocab/relation/supposedname"),
  SURVEYOR("http://bibfra.me/vocab/relation/surveyor"),
  TARGET_AUDIENCE("http://bibfra.me/vocab/marc/targetAudience"),
  TEACHER("http://bibfra.me/vocab/relation/teacher"),
  TECHNICAL_DIRECTOR("http://bibfra.me/vocab/relation/technicaldirector"),
  TECHNICAL_DRAFTSMAN("http://bibfra.me/vocab/relation/technicaldraftsman"),
  TELEVISION_DIRECTOR("http://bibfra.me/vocab/relation/televisiondirector"),
  TELEVISION_PRODUCER("http://bibfra.me/vocab/relation/televisionproducer"),
  TESTIFIER("http://bibfra.me/vocab/relation/testifier"),
  THESIS_ADVISOR("http://bibfra.me/vocab/relation/thesisadvisor"),
  TITLE("http://bibfra.me/vocab/marc/title"),
  TRANSCRIBER("http://bibfra.me/vocab/relation/transcriber"),
  TRANSLATOR("http://bibfra.me/vocab/relation/translator"),
  TYPE_DESIGNER("http://bibfra.me/vocab/relation/typedesigner"),
  TYPESETTER("http://bibfra.me/vocab/relation/typesetter"),
  TYPOGRAPHER("http://bibfra.me/vocab/relation/typographer"),
  UNIVERSITY_PLACE("http://bibfra.me/vocab/relation/universityplace"),
  VIDEOGRAPHER("http://bibfra.me/vocab/relation/videographer"),
  VOCALIST("http://bibfra.me/vocab/relation/vocalist"),
  VOICE_ACTOR("http://bibfra.me/vocab/relation/voiceactor"),
  WITNESS("http://bibfra.me/vocab/relation/witness"),
  WOODCUTTER("http://bibfra.me/vocab/relation/woodcutter"),
  WOOD_ENGRAVER("http://bibfra.me/vocab/relation/woodengraver"),
  WRITER_OF_ACCOMPANYING_MATERIAL("http://bibfra.me/vocab/relation/writerofaccompanyingmaterial"),
  WRITER_OF_ADDED_COMMENTARY("http://bibfra.me/vocab/relation/writerofaddedcommentary"),
  WRITER_OF_ADDED_LYRICS("http://bibfra.me/vocab/relation/writerofaddedlyrics"),
  WRITER_OF_ADDED_TEXT("http://bibfra.me/vocab/relation/writerofaddedtext"),
  WRITER_OF_INTRODUCTION("http://bibfra.me/vocab/relation/writerofintroduction"),
  WRITER_OF_PREFACE("http://bibfra.me/vocab/relation/writerofpreface"),
  WRITER_OF_SUPPLEMENTARY_TEXTUAL_CONTENT("http://bibfra.me/vocab/relation/writerofsupplementarytextualcontent");

  private final String uri;
  private final Long hash;

  PredicateDictionary(String uri) {
    this.uri = uri;
    this.hash = HashUtils.hash(uri);
  }

  public static Optional<PredicateDictionary> fromUri(String uri) {
    return Arrays.stream(PredicateDictionary.values())
      .filter(predicate -> Objects.equals(uri, predicate.getUri()))
      .findFirst();
  }
}
