<template>
  <div>
    <!-- 목록 S -->
    <v-card class="pa-3 my-5 mx-16" elevation="1" outlined>
      <v-card-title class="my-n2">
        결제 내역 목록
        <v-spacer />
      </v-card-title>
      <v-divider class="mx-4 mb-10" />
      <div class="v-data-table elevation-1">
        <div class="v-data-table__wrapper">
          <table>
            <colgroup>
              <!-- <col style="width: 20px;" /> -->
              <col />
              <col />
              <col />
              <col />
              <col />
            </colgroup>
            <thead class="v-data-table-header">
              <tr>
                <th
                  role="columnheader"
                  rowspan="2"
                  scope="col"
                  aria-label="목"
                  class="text-center grey lighten-2"
                  style="width: 80px; min-width: 80px"
                >
                  목
                </th>
                <th
                  role="columnheader"
                  rowspan="2"
                  scope="col"
                  aria-label="세목"
                  class="text-center grey lighten-2"
                  style="width: 140px; min-width: 140px"
                >
                  세목
                </th>
                <th
                  role="columnheader"
                  rowspan="2"
                  scope="col"
                  aria-label="세세목"
                  class="text-center grey lighten-2"
                  style="width: 300px; min-width: 300px"
                >
                  세세목
                </th>
                <th
                  role="columnheader"
                  rowspan="2"
                  scope="col"
                  aria-label="21년 연구비 총합"
                  class="text-center grey lighten-2"
                  style="width: 150px; min-width: 150px"
                >
                  21년 연구비 총합
                </th>
                <th
                  role="columnheader"
                  rowspan="2"
                  scope="col"
                  aria-label="21년 연구비 잔액"
                  class="text-center grey lighten-2"
                  style="width: 150px; min-width: 150px"
                >
                  21년 연구비 잔액
                </th>
                <th
                  role="columnheader"
                  colspan="2"
                  scope="col"
                  class="text-center grey lighten-2"
                >
                  <!-- style="width: 150px; min-width: 150px;" -->
                  210301-220228
                </th>
                <th
                  role="columnheader"
                  colspan="2"
                  scope="col"
                  class="text-center grey lighten-2"
                >
                  <!-- style="width: 150px; min-width: 150px;" -->
                  210101-2111231
                </th>
                <th
                  role="columnheader"
                  colspan="2"
                  scope="col"
                  class="text-center grey lighten-2"
                >
                  <!-- style="width: 150px; min-width: 150px;" -->
                  210101-211231
                </th>
              </tr>
              <tr>
                <th
                  role="columnheader"
                  scope="col"
                  aria-label="BRL(공)"
                  class="text-center grey lighten-2"
                  style="width: 150px; min-width: 150px"
                >
                  BRL(공)
                </th>
                <th
                  role="columnheader"
                  scope="col"
                  aria-label="BRL 잔액"
                  class="text-center grey lighten-2"
                  style="width: 150px; min-width: 150px"
                >
                  BRL 잔액
                </th>
                <th
                  role="columnheader"
                  scope="col"
                  aria-label="환경부(익스포좀)"
                  class="text-center grey lighten-2"
                  style="width: 150px; min-width: 150px"
                >
                  환경부(익스포좀)
                </th>
                <th
                  role="columnheader"
                  scope="col"
                  aria-label="환경부(익스포좀) 잔액"
                  class="text-center grey lighten-2"
                  style="width: 150px; min-width: 150px"
                >
                  환경부(익스포좀) 잔액
                </th>
                <th
                  role="columnheader"
                  scope="col"
                  aria-label="센터비(익스포좀)"
                  class="text-center grey lighten-2"
                  style="width: 150px; min-width: 150px"
                >
                  센터비(익스포좀)
                </th>
                <th
                  role="columnheader"
                  scope="col"
                  aria-label="센터비(익스포좀) 잔액"
                  class="text-center grey lighten-2"
                  style="width: 150px; min-width: 150px"
                >
                  센터비(익스포좀) 잔액
                </th>
              </tr>
            </thead>

            <tbody>
              <tr>
                <td class="text-center" rowspan="35">직접비</td>
                <td class="text-center" rowspan="2">내부인건비</td>
                <td class="text-left">미지급</td>
                <td class="text-right">59,746,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">29,546,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>

              <tr>
                <td class="text-left">지급</td>
                <td class="text-right">253,402,797</td>
                <td class="text-right">8,703,593</td>
                <td class="text-right">12,840,872</td>
                <td class="text-right">0</td>
                <td class="text-right">126,681,128</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>

              <tr>
                <td class="text-center" rowspan="2">외부인건비</td>
                <td class="text-left">미지급</td>
                <td class="text-right">4,500,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">4,500,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>

              <tr>
                <td class="text-left">지급</td>
                <td class="text-right">16,410,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">6,410,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>

              <tr>
                <td class="text-left" colspan="2">학생인건비</td>
                <td class="text-right">131,156,000</td>
                <td class="text-right">0</td>
                <td class="text-right">3,144,000</td>
                <td class="text-right">0</td>
                <td class="text-right">40,000,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>

              <tr>
                <td class="text-center" rowspan="2">연구재료비</td>
                <td class="text-left">재료비 및 전산처리관리비</td>
                <td class="text-right">998,455,075</td>
                <td class="text-right">2,886,981</td>
                <td class="text-right">88,667,388</td>
                <td class="text-right">0</td>
                <td class="text-right">446,216,067</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>

              <tr>
                <td class="text-left">시험제품·시험설비 제작경비</td>
                <td class="text-right">7,500,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>

              <tr>
                <td class="text-center" rowspan="4">연구시설, 장비비</td>
                <td class="text-left">
                  연구시설·장비의 임차비, 유지·보수비 등
                </td>
                <td class="text-right">184,499,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">3,128,400</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>

              <tr>
                <td class="text-left">연구시설·장비구입·설치비</td>
                <td class="text-right">38,751,400</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">18,460,000</td>
                <td class="text-right">0</td>
              </tr>

              <tr>
                <td class="text-left">시설·장비 개발경비</td>
                <td class="text-right">10,000,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>

              <tr>
                <td class="text-left">연구시설·장비 통합관리비</td>
                <td class="text-right">15,800,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>

              <tr>
                <td class="text-center" rowspan="23">연구활동비</td>
                <td class="text-left">국외여비</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">수용비 및 수수료</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">기술정보수집비</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">
                  연구개발서비스활용비(시험분석검사로)외부
                </td>
                <td class="text-right">66,667,000</td>
                <td class="text-right">940,990</td>
                <td class="text-right">17,037,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">위탁정산수수료</td>
                <td class="text-right">3,727,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">1,716,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">인쇄 및 복사비</td>
                <td class="text-right">727,000</td>
                <td class="text-right">227,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">논문교정 및 게재비</td>
                <td class="text-right">10,801,042</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">10,801,042</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">문헌구입비</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">전문가활용비</td>
                <td class="text-right">1,700,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">500,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">학회, 세미나 참가비</td>
                <td class="text-right">1,487,661</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">세미나 개최비</td>
                <td class="text-right">10,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">지식재산 조사비</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">원고료, 통역료, 번역료, 속기료</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">제세공과금, 수수료</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">교육훈련비</td>
                <td class="text-right">70,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">국내여비(소모성경비)</td>
                <td class="text-right">500,000</td>
                <td class="text-right">500,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">사무용기기 및 소프트웨어 등</td>
                <td class="text-right">703,370</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">연구과제운영경비(사무용품비)</td>
                <td class="text-right">9,279,851</td>
                <td class="text-right">1,111,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">1,736,328</td>
                <td class="text-right">0</td>
                <td class="text-right">3,184,850</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">연구실 환경유지비</td>
                <td class="text-right">742,650</td>
                <td class="text-right">200,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">486,750</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">연구실운영비용</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">연구과제운영경비(회의비)</td>
                <td class="text-right">6,863,500</td>
                <td class="text-right">13,370</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">936,700</td>
                <td class="text-right">4,328,400</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">연구과제운영경비(참여연구원 식대)</td>
                <td class="text-right">4,064,275</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">3,499,345</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left">위탁연구 개발비</td>
                <td class="text-right">85,000,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-center" colspan="2">연구수당</td>
                <td class="text-right">49,190,310</td>
                <td class="text-right">0</td>
                <td class="text-right">7,500,000</td>
                <td class="text-right">0</td>
                <td class="text-right">20,037,510</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-center" rowspan="2">간접비</td>
                <td class="text-left" colspan="2">간접비</td>
                <td class="text-right">371,380,319</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">132,334,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left" colspan="2">연구실 안전관리비(간접)</td>
                <td class="text-right">1,459,000</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left" colspan="3">부가세</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left" colspan="3">이자</td>
                <td class="text-right">3,670</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
                <td class="text-right">0</td>
              </tr>
              <tr>
                <td class="text-left" colspan="3">연구비 총합</td>
                <td class="text-right">2,263,766,670</td>
                <td class="text-right">13,595,594</td>
                <td class="text-right">129,193,000</td>
                <td class="text-right">0</td>
                <td class="text-right">794,000,000</td>
                <td class="text-right">0</td>
                <td class="text-right">26,460,000</td>
                <td class="text-right">0</td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    </v-card>
    <!-- 목록 E -->
  </div>
</template>

<script>
export default {
  data() {
    return {
      startDate: '',
      endDate: '',
      menu1: false,
      menu2: false,
      typeList: ['전체'],

      // Grid 설정
      headers: [
        {
          text: '세목',
          value: 'title',
          width: 100,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '사용목적',
          value: 'purpose',
          width: 100,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '결제 일자',
          value: 'date',
          width: 30,
          align: 'center',
          sortable: true,
          class: 'grey lighten-2',
        },
        {
          text: '결제 금액',
          value: 'price',
          width: 30,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '사업자명',
          value: 'businessName',
          width: 100,
          align: 'start',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '과제명',
          value: 'projectTitle',
          width: 80,
          align: 'start',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '과제번호',
          value: 'projectNo',
          width: 30,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
      ],
      list: [
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          date: '2021-07-02',
          price: '13,500',
          businessName: '이태원샐러드',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210095',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          purpose: '과제 참여연구원 야근 식대',
          date: '2021-07-01',
          price: '30,000',
          businessName: '육쌈냉면',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210095',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          date: '2021-06-30',
          price: '35,700',
          businessName: '백소정 중앙대점',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          date: '2021-06-29',
          price: '25,900',
          businessName: '나이스페이먼츠 주식회사',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
      ],
    };
  },
  created: function () {},
  mounted: function () {},
  methods: {
    test: function () {
      console.log('test');
    },
  },
};
</script>

<style scoped>
/* .v-data-table > .v-data-table__wrapper > table {
  font-size: 5pt !important;
} */
.v-data-table > .v-data-table__wrapper > table > thead > tr > th,
.v-data-table > .v-data-table__wrapper > table > tbody > tr > td {
  height: 25px;
  font-size: 10pt;
}
.v-data-table
  > .v-data-table__wrapper
  > table
  > tbody
  > tr:not(:last-child)
  > td:not(.v-data-table__mobile-row) {
  border-bottom: thin solid rgba(0, 0, 0, 0.12);
}

.v-data-table > .v-data-table__wrapper > table > tbody > tr > td {
  border-right: thin solid rgba(0, 0, 0, 0.12);
}

.v-data-table
  > .v-data-table__wrapper
  > table
  > thead
  > tr
  > th:not(.v-data-table__mobile-row) {
  border-bottom: thin solid white !important;
}

.v-data-table > .v-data-table__wrapper > table > thead > tr > th {
  border-right: thin solid white !important;
}

.v-data-table__wrapper {
  overflow: scroll;
  height: 700px;
}
</style>
