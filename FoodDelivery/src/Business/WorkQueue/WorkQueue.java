
package Business.WorkQueue;

import java.util.ArrayList;


public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        if (workRequestList == null) {
            workRequestList = new ArrayList();
        }
        return workRequestList;
    }

    public void addWorkRequest(WorkRequest workRequest) {
        workRequestList.add(workRequest);
    }
}
