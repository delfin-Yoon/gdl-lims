// module.exports = {
//   runtimeCompiler: true,

//   devServer: {
//     overlay: false,
//     proxy: 'http://localhost:8081'
//   },

//   transpileDependencies: [
//     'vuetify'
//   ],
// }

const { defineConfig } = require('@vue/cli-service');
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave: false,
  devServer: {
    client: {
      overlay: false,
    },
    proxy: {
      '/api': {
        target: 'http://localhost:8081',
        changeOrigin: true,
      },
    },
  },
});
