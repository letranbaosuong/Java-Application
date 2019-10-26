/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demofirebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import java.io.IOException;
import static org.apache.http.client.methods.RequestBuilder.options;

/**
 *
 * @author Suong
 */
public class TestFireBase {

    public static void main(String[] args) throws IOException {
        System.out.println("1");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.getApplicationDefault())
                .setDatabaseUrl("https://<DATABASE_NAME>.firebaseio.com/")
                .build();

        FirebaseApp.initializeApp(options);

        FirebaseApp.initializeApp();
        String defaultOptions = null;

        // Initialize the default app
        FirebaseApp defaultApp = FirebaseApp.initializeApp(defaultOptions);

        System.out.println(defaultApp.getName());  // "[DEFAULT]"

// Retrieve services by passing the defaultApp variable...
        FirebaseAuth defaultAuth = FirebaseAuth.getInstance(defaultApp);
        FirebaseDatabase defaultDatabase = FirebaseDatabase.getInstance(defaultApp);

// ... or use the equivalent shorthand notation
        defaultAuth = FirebaseAuth.getInstance();
        defaultDatabase = FirebaseDatabase.getInstance();

        // Initialize the default app
        FirebaseApp defaultApp = FirebaseApp.initializeApp(defaultOptions);
        FirebaseOptions otherAppConfig = null;

// Initialize another app with a different config
        FirebaseApp otherApp = FirebaseApp.initializeApp(otherAppConfig, "other");

        System.out.println(defaultApp.getName());  // "[DEFAULT]"
        System.out.println(otherApp.getName());    // "other"

// Use the shorthand notation to retrieve the default app's services
        FirebaseAuth defaultAuth = FirebaseAuth.getInstance();
        FirebaseDatabase defaultDatabase = FirebaseDatabase.getInstance();

// Use the otherApp variable to retrieve the other app's services
        FirebaseAuth otherAuth = FirebaseAuth.getInstance(otherApp);
        FirebaseDatabase otherDatabase = FirebaseDatabase.getInstance(otherApp);
    }
}
