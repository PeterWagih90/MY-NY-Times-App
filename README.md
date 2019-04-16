# NYTimes
A simple android app to hit the NY Times Most Popular Articles API and show a list of articles, that shows details when items on the list are tapped (a typical master/detail app).

We'll be using the most viewed section of this API. Note: you need to signup for an API key
at: https://developer.nytimes.com/get-started, then replace the ‘sample-key’ below with
the API key assigned to your account.
http://api.nytimes.com/svc/mostpopular/v2/viewed/{period}.json?api-key=sample-key
To test this API, you can change the period section of the path (available period values are 1,
7 and 30, which represents how far back, in days, the API returns results for).
https://api.nytimes.com/svc/mostpopular/v2/viewed/7.json?api-key=sample-key

## NY Times API

To Get started using the APIs in four steps:

<b>Create an Account:</b>
 *If you don't already have an account create one:

 1. Click Sign In.
 2. Click Create account and follow prompts to register.
 3. Sign In
 
<b>To sign in to the portal:</b>
 1. Click Sign In.
 2. Enter your email address and password.
 3. Click Sign In.
 
<b>Register apps</b>
To register an app:
 1. Select My Apps from the user drop-down.
 2. Click + New App to create a new app.
 3. Enter a name and description for the app in the New App dialog.
 4. Click Create.
 5. Click the APIs tab.
 6. Click the access toggle to enable or disable access to an API product from the app.
 
<b>Access the API keys</b>
 1. Select My Apps from th user drop-down.
 2. Click the app in the list.
 3. View the API key on the App Details tab.
 4. Confirm that the status of the API key is Approved.
 
<b>APIs</b>

The [APIs](https://developer.nytimes.com/apis) page has information on the different APIs. The documentation for each API includes an interactive reference for trying out the API.

## Developed
1. Model–view–viewmodel (MVVM) architectural pattern
2. Offline supported
3. Retrofit server call 
4. UI & functions tested using JUnit & espress
5. NDK/C++ secure api key and urls

## Change API Key
To change api key it is located in native-lib.ccp.
Just put your own key and rebuild the app.

```c
extern "C"
JNIEXPORT jstring JNICALL
Java_com_peter_android_nytimes_utility_Constant_getApiKey(JNIEnv *env, jclass type) {
    return env->NewStringUTF("AlpOwSYKJjFx3nCMHKaKmo8svWW6bTYc");
}
```

## Screens
<b>Splash Screen</b>
<img src="Screenshots/image1.png" alt="Splash Screen"/>

<b>Main article list Screen</b>
<img src="Screenshots/image2.png" alt="Main article list"/>

<b>Details View Screen</b>
<img src="Screenshots/image3.png" alt="Details View Screen"/>

