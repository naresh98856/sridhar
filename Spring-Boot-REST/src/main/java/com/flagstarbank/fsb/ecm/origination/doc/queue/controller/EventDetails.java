package com.flagstarbank.fsb.ecm.origination.doc.queue.controller;

public class EventDetails
{
    private String documentType;

    private String docId;

    private String documentIntent;

    private String timestamp;

    public String getDocumentType ()
    {
        return documentType;
    }

    public void setDocumentType (String documentType)
    {
        this.documentType = documentType;
    }

    public String getDocId ()
    {
        return docId;
    }

    public void setDocId (String docId)
    {
        this.docId = docId;
    }

    public String getDocumentIntent ()
    {
        return documentIntent;
    }

    public void setDocumentIntent (String documentIntent)
    {
        this.documentIntent = documentIntent;
    }

    public String getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (String timestamp)
    {
        this.timestamp = timestamp;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [documentType = "+documentType+", docId = "+docId+", documentIntent = "+documentIntent+", timestamp = "+timestamp+"]";
    }
}
			