import React from 'react';
import {StyleSheet, Text, View} from 'react-native';
import TextWithLocale from './TextWithLocale';

const App = () => {
  return (
    <View
      style={StyleSheet.flatten({
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center',
      })}>
      <Text>Hola</Text>
      <TextWithLocale
        accessibilityLabel="Holanda"
        locale="it"
        style={{height: 30, width: 30}}
      />
    </View>
  );
};

export default App;
