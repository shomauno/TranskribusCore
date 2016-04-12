package eu.transkribus.core.model.beans.job.enums;

public enum JobImpl {
	DeleteDocumentJob(JobTask.DeleteDocument, JobTask.DeleteDocument.getLabel(), "DeleteDocJob"),
	MetsImportJob(JobTask.CreateDocument, JobTask.CreateDocument.getLabel(), "MetsImportJob"),
	DocImportJob(JobTask.CreateDocument, JobTask.CreateDocument.getLabel(), "DocImportJob"),
	ZipDocImportJob(JobTask.CreateDocument, JobTask.CreateDocument.getLabel(), "ZipDocImportJob"),
	GoobiMetsImportJob(JobTask.CreateDocument, JobTask.CreateDocument.getLabel(), "GoobiMetsImportJob"),
	DuplicateDocumentJob(JobTask.DuplicateDocument, JobTask.DuplicateDocument.getLabel(), "DuplicateDocJob"),
	DeleteDocJob(JobTask.DeleteDocument, JobTask.DeleteDocument.getLabel(), "DeleteDocJob"),
	
	NcsrDetectBaselinesJob(JobTask.DetectBaselines, JobTask.DetectBaselines.getLabel(), "NcsrDetectBaselinesJob"),
	NcsrDetectLinesJob(JobTask.DetectLines, JobTask.DetectLines.getLabel(), "NcsrDetectLinesJob"),
	NcsrDetectBlocksJob(JobTask.DetectBlocks, JobTask.DetectBlocks.getLabel(), "NcsrDetectBlocksJob"),
	NcsrDetectWordsJob(JobTask.DetectWords, JobTask.DetectWords.getLabel(), "NcsrDetectWordsJob"),
	
	HmmHtrJob(JobTask.Htr, "HMM " + JobTask.Htr.getLabel(), "HmmHtrJob"),
	HmmHtrTrainingJob(JobTask.HtrTraining, "HMM " + JobTask.HtrTraining.getLabel(), "HmmHtrTrainingJob"),
	RnnHtrJob(JobTask.Htr, "RNN " + JobTask.Htr.getLabel(), "RnnHtrJob"),
	FinereaderOcrJob(JobTask.Ocr, JobTask.Ocr.getLabel(), "OcrJob"),
	
	//for testing
	DummyJob(JobTask.CreateDocument, "Dummy Job", "DummyJob");
	
	private JobTask task;
	private String label;
	private String className;
	JobImpl(JobTask task, String label, String className){
		this.task = task;
		this.label = label;
		this.className = className;
	}
	
	public JobTask getTask(){
		return task;
	}
	public String getClassName(){
		return className;
	}

	public String getLabel() {
		return label;
	}
}
