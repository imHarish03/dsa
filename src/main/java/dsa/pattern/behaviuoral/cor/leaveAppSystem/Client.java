package dsa.pattern.behaviuoral.cor.leaveAppSystem;

public class Client {
    public static void main(String[] args) {
        LeaveApprover teamLead = new TeamLead();
        LeaveApprover projectManager = new ProjectManager();
        LeaveApprover hr = new HR();

        teamLead.setNextApprover(projectManager);
        projectManager.setNextApprover(hr);

        teamLead.processLeaveRequest(1); // Team Lead approves
        teamLead.processLeaveRequest(4); // Project Manager approves
        teamLead.processLeaveRequest(10); // HR approves
    }
}
