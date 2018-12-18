
# react-native-kommunicate

## Getting started

`$ npm install react-native-kommunicate --save`

### Mostly automatic installation

`$ react-native link react-native-kommunicate`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-react-native-kommunicate` and add `RNReactNativeKommunicate.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativeKommunicate.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativeKommunicatePackage;` to the imports at the top of the file
  - Add `new RNReactNativeKommunicatePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-react-native-kommunicate'
  	project(':react-native-react-native-kommunicate').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-react-native-kommunicate/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-react-native-kommunicate')
  	```

## Usage
```javascript
import RNReactNativeKommunicate from 'react-native-react-native-kommunicate';

// TODO: What to do with the module?
RNReactNativeKommunicate;
```
  