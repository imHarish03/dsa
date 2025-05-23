package dsa.pattern.behaviuoral.cor.leaveAppSystem;

class TeamLead extends LeaveApprover {
    @Override
    public void processLeaveRequest(int days) {
        if (days <= 2) {
            System.out.println("Team Lead approved leave for " + days + " days.");
        } else if (nextApprover != null) {
            nextApprover.processLeaveRequest(days);
        }
    }
}

class ProjectManager extends LeaveApprover {
    @Override
    public void processLeaveRequest(int days) {
        if (days <= 5) {
            System.out.println("Project Manager approved leave for " + days + " days.");
        } else if (nextApprover != null) {
            nextApprover.processLeaveRequest(days);
        }
    }
}

class HR extends LeaveApprover {
    @Override
    public void processLeaveRequest(int days) {
        System.out.println("HR approved leave for " + days + " days.");
    }
}
