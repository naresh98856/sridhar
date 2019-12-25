package com.flagstarbank.fsb.ecm.origination.doc.queue.controller;

public class Event
{
    private EventDetails eventDetails;

    private String eventName;

    private String notificationId;

    private String loanNumber;

    public EventDetails getEventDetails ()
    {
        return eventDetails;
    }

    public void setEventDetails (EventDetails eventDetails)
    {
        this.eventDetails = eventDetails;
    }

    public String getEventName ()
    {
        return eventName;
    }

    public void setEventName (String eventName)
    {
        this.eventName = eventName;
    }

    public String getNotificationId ()
    {
        return notificationId;
    }

    public void setNotificationId (String notificationId)
    {
        this.notificationId = notificationId;
    }

    public String getLoanNumber ()
    {
        return loanNumber;
    }

    public void setLoanNumber (String loanNumber)
    {
        this.loanNumber = loanNumber;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [eventDetails = "+eventDetails+", eventName = "+eventName+", notificationId = "+notificationId+", loanNumber = "+loanNumber+"]";
    }
}
			
			