/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.testfirebase;

import com.chilkatsoft.*;

/**
 *
 * @author Suong
 */
public class GetFirebaseAccessToken {

    static {
        try {
            System.loadLibrary("chilkat");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Native code library failed to load.\n" + e);
            System.exit(1);
        }
    }

    public static void main(String argv[]) {
        //  This example requires the Chilkat API to have been previously unlocked.
        //  See Global Unlock Sample for sample code.

        //  First load the Firebase JSON private key into a string.
        CkFileAccess fac = null;
        String jsonKey = fac.readEntireTextFile("C:\\Users\\Suong\\Desktop\\hoctap\\nam3\\Java-Application\\Test\\NetBeans\\TestFirebase\\src\\com\\dhpm11\\testfirebase\\google-services.json", "utf-8");
        if (fac.get_LastMethodSuccess() != true) {
            System.out.println(fac.lastErrorText());
            return;
        }

        //  A Firebase JSON private key should look something like this:
        //  {
        //    "type": "service_account",
        //    "project_id": "firebase-chilkat",
        //    "private_key_id": "1c664ee164907413c91ddefcf5b765ecba8779e2",
        //    "private_key": "-----BEGIN PRIVATE KEY-----\nMIIEvQIBA ... Ya2UZii/lXn73/ZOK8=\n-----END PRIVATE KEY-----\n",
        //    "client_email": "firebase-adminsdk-n28n4@firebase-chilkat.iam.gserviceaccount.com",
        //    "client_id": "134846322329335418431",
        //    "auth_uri": "https://accounts.google.com/o/oauth2/auth",
        //    "token_uri": "https://accounts.google.com/o/oauth2/token",
        //    "auth_provider_x509_cert_url": "https://www.googleapis.com/oauth2/v1/certs",
        //    "client_x509_cert_url": "https://www.googleapis.com/robot/v1/metadata/x509/firebase-adminsdk-n28n4%40firebase-chilkat.iam.gserviceaccount.com"
        //  }
        // 
        CkAuthGoogle gAuth = null;
        gAuth.put_JsonKey(jsonKey);

        //  Choose a scope.
        //  The scope could be "https://www.googleapis.com/auth/firebase.database"
        //  or a space-delimited list of scopes:
        //  "https://www.googleapis.com/auth/firebase.database https://www.googleapis.com/auth/userinfo.email"
        gAuth.put_Scope("https://www.googleapis.com/auth/firebase.database https://www.googleapis.com/auth/userinfo.email");

        //  Request an access token that is valid for this many seconds.
        gAuth.put_ExpireNumSeconds(3600);

        //  If the application is requesting delegated access:
        //  The email address of the user for which the application is requesting delegated access,
        //  then set the email address here. (Otherwise leave it empty.)
        gAuth.put_SubEmailAddress("");

        //  Connect to www.googleapis.com using TLS (TLS 1.2 is the default.)
        //  The Chilkat socket object is used so that the connection can be established
        //  through proxies or an SSH tunnel if desired.
        CkSocket tlsSock = null;
        boolean success = tlsSock.Connect("www.googleapis.com", 443, true, 5000);
        if (success != true) {
            System.out.println(tlsSock.lastErrorText());
            return;
        }

        //  Send the request to obtain the access token.
        success = gAuth.ObtainAccessToken(tlsSock);
        if (success != true) {
            System.out.println(gAuth.lastErrorText());
            return;
        }

        //  Examine the access token:
        System.out.println("Firebase Access Token: " + gAuth.accessToken());

        //  Save the token to a file (or wherever desired).  This token is valid for 1 hour.
        fac.WriteEntireTextFile("qa_data/tokens/firebaseToken.txt", gAuth.accessToken(), "utf-8", false);
    }
}
