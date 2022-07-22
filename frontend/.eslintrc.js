// .eslintrc.js
// module.exports = {
//   extends: [
//     // 'plugin:vue/recommended',
//     // 'plugin:vue/essential',
//     // 'eslint:recommended',
//     // 'plugin:prettier/recommended'
//     'eslint:recommended',
//     'plugin:vue/essential',
//     'prettier',
//     'plugin:prettier/recommended',
//   ],
//   plugins: ['prettier'],
//   // parser: 'babel-eslint',
//   rules: {
//     // "vue/max-attributes-per-line": "off",
//     // 'prettier/prettier': [
//     //   'error',
//     //   {
//     //     singleQuote: true,
//     //     semi: true,
//     //     useTabs: false,
//     //     tabWidth: 2,
//     //     trailingComma: 'all',
//     //     printWidth: 80,
//     //     bracketSpacing: true,
//     //     arrowParens: 'avoid',
//     //     endOfLine: 'auto',
//     //   },
//     // ],
//     'prettier/prettier': [
//       'error',
//       // 아래 규칙들은 개인 선호에 따라 prettier 문법 적용
//       // https://prettier.io/docs/en/options.html
//       {
//         singleQuote: true,
//         semi: true,
//         useTabs: true,
//         tabWidth: 2,
//         trailingComma: 'all',
//         printWidth: 80,
//         bracketSpacing: true,
//         arrowParens: 'avoid',
//       },
//     ],
//     'no-console': process.env.NODE_ENV === 'production' ? 'error' : 'off',
//   }
// }

// }
// module.exports = {
//   "parser": "@babel/eslint-parser",
//   "parserOptions": { "requireConfigFile" : "false" },
//   "babelOptions": { "configFile": "./.babelrc", }
// }

// module.exports = {
//   root: true,
//   env: {
//     node: true,
//   },
//   extends: [
//     "plugin:vue/essential",
//     "eslint:recommended",
//     "plugin:prettier/recommended",
//   ],
//   parserOptions: {
//     parser: "@babel/eslint-parser",
//   },
//   rules: {
//     "no-console": process.env.NODE_ENV === "production" ? "warn" : "off",
//     "no-debugger": process.env.NODE_ENV === "production" ? "warn" : "off",
//   },
// };

module.exports = {
  root: true,
  env: {
    node: true,
  },
  extends: [
    'plugin:vue/essential',
    'eslint:recommended',
    'plugin:prettier/recommended',
  ],
  parserOptions: {
    parser: '@babel/eslint-parser',
  },
  rules: {
    'no-console': 'off',
    'no-unused-vars': 'off',
    // "no-console": process.env.NODE_ENV === "production" ? "warn" : "off",
    // "no-debugger": process.env.NODE_ENV === "production" ? "warn" : "off",
    'vue/multi-word-component-names': [
      'error',
      {
        ignores: ['default', 'Login'],
      },
    ],
    'prettier/prettier': [
      'error',
      {
        singleQuote: true,
        semi: true,
        useTabs: false,
        tabWidth: 2,
        trailingComma: 'all',
        printWidth: 80,
        bracketSpacing: true,
        arrowParens: 'avoid',
        endOfLine: 'auto',
      },
    ],
  },
};
