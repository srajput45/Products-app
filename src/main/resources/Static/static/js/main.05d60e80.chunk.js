(this["webpackJsonpfirst-app"]=this["webpackJsonpfirst-app"]||[]).push([[0],{41:function(e,t,c){"use strict";c.r(t);var s=c(1),n=c.n(s),a=c(16),i=c.n(a),r=c(3),d=c(4),j=c(6),l=c(5),o=c(0),b=function(e){Object(j.a)(c,e);var t=Object(l.a)(c);function c(){return Object(r.a)(this,c),t.apply(this,arguments)}return Object(d.a)(c,[{key:"componentDidMount",value:function(){console.log("App component mounted")}},{key:"render",value:function(){return Object(o.jsx)("div",{children:Object(o.jsxs)("h1",{children:["Hello ",this.props.propsForApp]})})}}]),c}(s.Component),h=function(e){return Object(o.jsx)("div",{children:Object(o.jsxs)("table",{className:"ui celled table",children:[Object(o.jsx)("thead",{children:Object(o.jsxs)("tr",{children:[Object(o.jsx)("th",{children:"Name"}),Object(o.jsx)("th",{children:"Age"}),Object(o.jsx)("th",{children:"Job"})]})}),Object(o.jsxs)("tbody",{children:[Object(o.jsxs)("tr",{children:[Object(o.jsx)("td",{"data-label":"Name",children:e.name}),Object(o.jsx)("td",{"data-label":"Age",children:e.id}),Object(o.jsx)("td",{"data-label":"Job",children:e.job})]}),Object(o.jsxs)("tr",{children:[Object(o.jsx)("td",{"data-label":"Name",children:"James"}),Object(o.jsx)("td",{"data-label":"Age",children:"24"}),Object(o.jsx)("td",{"data-label":"Job",children:"Engineer"})]}),Object(o.jsxs)("tr",{children:[Object(o.jsx)("td",{"data-label":"Name",children:"Jill"}),Object(o.jsx)("td",{"data-label":"Age",children:"26"}),Object(o.jsx)("td",{"data-label":"Job",children:"Engineer"})]}),Object(o.jsxs)("tr",{children:[Object(o.jsx)("td",{"data-label":"Name",children:"Elyse"}),Object(o.jsx)("td",{"data-label":"Age",children:"24"}),Object(o.jsx)("td",{"data-label":"Job",children:"Designer"})]})]})]})})},p=c(17),O=c.n(p).a.create({baseURL:"http://localhost:8080/"}),u=function(e){Object(j.a)(c,e);var t=Object(l.a)(c);function c(){return Object(r.a)(this,c),t.apply(this,arguments)}return Object(d.a)(c,[{key:"render",value:function(){var e=this.props.review;return Object(o.jsx)("div",{className:"ui cards",children:Object(o.jsx)("div",{className:"card",children:Object(o.jsxs)("div",{className:"content",children:[Object(o.jsx)("div",{className:"header",children:e.reviewer}),Object(o.jsx)("div",{className:"meta",children:"customer"}),Object(o.jsx)("div",{className:"description",children:e.reviewText}),Object(o.jsxs)("div",{className:"description",children:["Rating: ",e.rating]})]})})})}}]),c}(s.Component),x=function(e){Object(j.a)(c,e);var t=Object(l.a)(c);function c(){var e;Object(r.a)(this,c);for(var s=arguments.length,n=new Array(s),a=0;a<s;a++)n[a]=arguments[a];return(e=t.call.apply(t,[this].concat(n))).state={reviews:[]},e.showReviews=function(){O.get("/products/"+e.props.prod.id+"/reviews").then((function(t){console.log(t),e.setState({reviews:t.data})})),e.state.reviews},e}return Object(d.a)(c,[{key:"render",value:function(){var e=this.props.prod;return Object(o.jsx)(s.Fragment,{children:Object(o.jsx)("div",{class:"ui card",children:Object(o.jsxs)("div",{class:"content",children:[Object(o.jsx)("a",{class:"header",children:e.name}),Object(o.jsxs)("div",{class:"description",children:["Price: ",e.prise]}),Object(o.jsxs)("div",{class:"description",children:["Quantity On Hand: ",e.qoh]}),Object(o.jsx)("div",{class:"description",children:Object(o.jsx)("button",{class:"ui positive basic button",onClick:this.showReviews,children:"Review"})}),Object(o.jsx)("div",{className:"extra content",children:this.state.reviews.map((function(e){return Object(o.jsx)(u,{review:e},e.id)}))})]})})})}}]),c}(s.Component),m=function(e){Object(j.a)(c,e);var t=Object(l.a)(c);function c(){var e;Object(r.a)(this,c);for(var s=arguments.length,n=new Array(s),a=0;a<s;a++)n[a]=arguments[a];return(e=t.call.apply(t,[this].concat(n))).state={id:1,name:"shubham",job:"Mst hai",data:[{id:1,name:"shubham"},{id:2,name:"shu"},{id:3,name:"shub"}],product:[]},e}return Object(d.a)(c,[{key:"componentDidMount",value:function(){var e=this;O.get("/products").then((function(t){console.log(t),e.setState({product:t.data})}))}},{key:"render",value:function(){return Object(o.jsxs)("div",{className:"ui container",children:[Object(o.jsx)(b,{}),Object(o.jsx)("h1",{children:"Inside Child Component"}),Object(o.jsx)("h2",{children:this.props.propsExample+" "+this.props.id}),Object(o.jsx)("h2",{children:this.props.id}),Object(o.jsx)(h,{name:this.state.name,id:this.state.id,job:this.state.job}),this.state.data.map((function(e){return Object(o.jsxs)("h4",{children:[e.id," ",e.name]},e.id)})),this.state.product.map((function(e){return Object(o.jsx)(x,{prod:e},e.id)}))]})}}]),c}(s.Component);i.a.render(Object(o.jsxs)(n.a.StrictMode,{children:[Object(o.jsx)(b,{propsForApp:"Props from App"}),Object(o.jsx)(m,{propsExample:"this is the example of props",id:2})]}),document.getElementById("root"))}},[[41,1,2]]]);
//# sourceMappingURL=main.05d60e80.chunk.js.map