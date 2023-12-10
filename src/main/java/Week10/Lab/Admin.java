package Week10.Lab;

@UserPermission(2)
class Admin {
    private String username;

    public Admin(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }
}
