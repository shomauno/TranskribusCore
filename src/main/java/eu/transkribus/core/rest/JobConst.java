package eu.transkribus.core.rest;

public class JobConst {
	public static final String SEP = ",";
	
	public static final String JOBS_PACKAGE = "eu.transkribus.persistence.jobs.";
	
	public static final String STATE_CREATE = "create";
	public static final String STATE_HTR = "htr";
	public static final String STATE_FINISH = "finish";
	public static final String STATE_DOWNLOAD = "download";
	public static final String STATE_OCR = "ocr";
	public static final String STATE_INGEST = "ingest";
	
	public static final String PROP_DOC_ID = "docId";
	public static final String PROP_PAGE_NR = "pageNr";
	public static final String PROP_JOB_ID = "jobId";
	public static final String PROP_USER_ID = "userId";
	public static final String PROP_USER_NAME = "userName";
	public static final String PROP_SESSION_ID = "sessionId";
	public static final String PROP_COLLECTION_ID = "colId";
	public static final String PROP_TITLE = "title";
	public static final String PROP_TRANSCRIPT_ID = "transcriptId";
	public static final String PROP_REG_IDS = "regIds";
	public static final String PROP_TRANSCRIPTS = "transcripts";
	
	public static final String PROP_STATE = "state";
	public static final String PROP_MODELNAME = "modelName";
	public static final String PROP_MODEL_ID = "modelId";
	public static final String PROP_PAGES = "pages";
	public static final String PROP_DOC_IDS = "docIds";
	public static final String PROP_PATH = "path";
	public static final String PROP_DEALOG_DOC_ID = "dealogDocId";
	public static final String PROP_METS_PATH = "metsPath";
	
	public static final String PROP_DICTNAME = "dictName";
	public static final String PROP_NUM_EPOCHS = "numEpochs";
	public static final String PROP_LEARNING_RATE = "learningRate";
	public static final String PROP_NOISE = "noise";
	public static final String PROP_NR_OF_THREADS = "nrOfThreads";
	public static final String PROP_TRAIN_SIZE_PER_EPOCH = "trainSizePerEpoch";
	public static final String PROP_BASE_MODEL = "baseModel";
	public static final String PROP_CONFIG = "config";
	
	public static final String PROP_DO_BLOCK_SEG = "doBlockSeg";
	public static final String PROP_DO_LINE_SEG = "doLineSeg";
	public static final String PROP_DO_WORD_SEG = "doWordSeg";
	public static final String PROP_DO_POLYGON_TO_BASELINE = "doPolygonToBaseline";

	public static final String PROP_SOLR_URL = "solrUrl";

	public static final String PROP_ADDITIONAL_COL_IDS = "additionalColIds";

	public static final String PROP_EXPORT_OPTIONS = "options";

}
