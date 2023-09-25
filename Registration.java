package GroupTasks2;




public class Registration {
        private String email;
        private String userName;
        private String password;

        public Registration() {
            this.email = " ";
            this.userName = " ";
            this.password = " ";
        }

        public void setEmail(String email) {
            if (isValidYahooEmail(email)) {
                this.email = email;
            } else {
                System.out.println("Invalid email address. Please use a Yahoo email address.");
            }
        }

        public void setUserName(String userName) {
            if (userName.length() > 6) {
                this.userName = userName;
            } else {
                System.out.println("Username must be at least 7 characters long.");
            }
        }

        public void setPassword(String password) {
            if (password.length() > 6 && !password.contains(userName)) {
                this.password = password;
            } else {
                System.out.println("Password must be at least 7 characters long and cannot contain the username.");
            }
        }

        private boolean isValidYahooEmail(String email) {
            return email.endsWith("@yahoo.com");
        }

        public void displayRegistration() {
            System.out.println("Email: " + email);
            System.out.println("Username: " + userName);
            System.out.println("Password: " + password);
        }

        public static void main(String[] args) {
            Registration user = new Registration();
            user.setEmail("user@yahoo.com");
            user.setUserName("myusername");
            user.setPassword("mypassword");

            user.displayRegistration();
        }
    }

