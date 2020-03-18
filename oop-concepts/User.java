/*
* Copyright (c) 2020, Mando (0mand0) and/or Samuel Mofrad. All rights reserved. 
*/

class User {
    String userName = "Mando";
    String email = "mando@mondo.earth";

    public void getUser() {
        System.out.println (
            "user: \n"
            + "user name: "
            + userName
            + "\n"
            + "email: "
            + email
        );
    }

    public static void main(String[] args) {
        User user = new User();
        user.getUser();    
    }
}