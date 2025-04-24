package org.howard.edu.lspfinal.question3;

/**
 * Defines the template for generating reports:
 * load data, format it, and print the result.
 */
public abstract class Report {
    /**
     * The template method: defines the workflow for all reports.
     * Marked final to prevent subclasses from altering the workflow.
     */
    public final void generateReport() {
        loadData();
        formatData();
        printReport();
    }

    /** Load the raw data for the report. */
    protected abstract void loadData();

    /** Format the loaded data for presentation. */
    protected abstract void formatData();

    /** Print out the final report. */
    protected abstract void printReport();
}
