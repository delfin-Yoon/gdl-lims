<template>
  <div>
    main
    <div>
      chart test area
      <Plotly :data="data" :layout="layout" :display-mode-bar="false"></Plotly>
    </div>
  </div>
</template>

<script>
import { Plotly } from 'vue-plotly';

export default {
  components: {
    Plotly,
  },
  data: function () {
    return {
      data: [
        {
          // x: [1, 2, 3, 4],
          // y: [10, 15, 13, 17],
          // type: 'scatter',
          z: [
            [1, null, 30, 50, 1],
            [20, 1, 60, 80, 30],
            [30, 60, 1, -10, 20],
          ],
          x: ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday'],
          y: ['Morning', 'Afternoon', 'Evening'],
          type: 'heatmap',
        },
      ],
      layout: {
        title: 'My graph',
      },
    };
  },
};
</script>

<style></style>
