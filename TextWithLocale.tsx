import React from 'react';
import {requireNativeComponent, TextProps} from 'react-native';

const TextWithLocaleComp = requireNativeComponent('TextWithLocale');

const TextWithLocale = (props: TextProps & {locale?: string}) => (
  <TextWithLocaleComp {...props} />
);

export default TextWithLocale;
