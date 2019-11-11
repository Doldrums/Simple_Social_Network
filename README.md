# Simple Social Network

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/46f350d69d914189bca160241dbe48cd)](https://app.codacy.com/app/Doldrums/Simple_Social_Network?utm_source=github.com&utm_medium=referral&utm_content=Doldrums/Simple_Social_Network&utm_campaign=Badge_Grade_Dashboard)

This application is a sample for a social network.
Includes Login(Main) Activity **(login - "test", password - "test")** and  Feed Activity.
The last one uses bottom navigation bar for switching types of news(Feed, Dashboard, Notification), but does not employ fragments. This makes Feed Activity much more compact. 

## Screenshots are presented below
<p>
<img src="https://github.com/Doldrums/Simple_Social_Network/blob/master/app/src/main/res/drawable/one.jpg" width="200" height="350" />
<img src="https://github.com/Doldrums/Simple_Social_Network/blob/master/app/src/main/res/drawable/two.jpg" width="200" height="350" />
<img src="https://github.com/Doldrums/Simple_Social_Network/blob/master/app/src/main/res/drawable/three.jpg" width="200" height="350" />
<img src="https://github.com/Doldrums/Simple_Social_Network/blob/master/app/src/main/res/drawable/four.jpg" width="200" height="350" />
<img src="https://github.com/Doldrums/Simple_Social_Network/blob/master/app/src/main/res/drawable/five.jpg" width="200" height="350" />
<img src="https://github.com/Doldrums/Simple_Social_Network/blob/master/app/src/main/res/drawable/six.jpg" width="200" height="350" />
<img src="https://github.com/Doldrums/Simple_Social_Network/blob/master/app/src/main/res/drawable/seven.jpg" width="200" height="350" />
</p>

## Installation
Clone this repository and import into **Android Studio**
```bash
git clone https://github.com/Doldrums/Simple_Social_Network.git
```
## Build variants
Use the Android Studio *Build Variants* button to choose between **production** and **staging** flavors combined with debug and release build types

## Generating signed APK
From Android Studio:
1. ***Build*** menu
2. ***Generate Signed APK...***
3. Fill in the keystore information *(you only need to do this once manually and then let Android Studio remember it)*

## Contributing
1. Fork it
2. Create your feature branch (git checkout -b my-new-feature)
3. Commit your changes (git commit -m 'Add some feature')
4. Run the linter (ruby lint.rb').
5. Push your branch (git push origin my-new-feature)
6. Create a new Pull Request
