package dsa.pattern.behaviuoral.cor.leaveAppSystem;

abstract class LeaveApprover {
    protected LeaveApprover nextApprover;

    public void setNextApprover(LeaveApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processLeaveRequest(int days);
}
