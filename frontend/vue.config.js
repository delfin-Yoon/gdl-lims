module.exports = {
  runtimeCompiler: true,

  devServer: {
    overlay: false,
    proxy: 'http://localhost:8081'
  },

  transpileDependencies: [
    'vuetify'
  ],
}
