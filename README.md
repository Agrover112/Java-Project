# Hospital Management Project in Java
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![All Contributors](https://img.shields.io/badge/all_contributors-1-orange.svg?style=flat-square)](#contributors-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->
- GUI using AWT and Swing
- Neural Network trained using DL4J

## Class Diagram

[![](https://mermaid.ink/img/eyJjb2RlIjoiY2xhc3NEaWFncmFtXG5cdEJDVyAtLT4gUHJlZGljdFxuICBCQ1cgLS0-IEhvbWVHVUlcbiAgUHJlZGljdCAtLT5ETDRqXG5cbiAgSG9tZUdVSSAtLT5Vc2VyXG4gIFVzZXIgLS18Pk9wZXJhdGlvbnNcblxuXHRCQ1cgOiArYWdlICA6ICAgICBpbnRcblx0QkNXIDogK2dlbmRlcjogIFN0cmluZ1xuXHRCQ1c6ICtCQ1coKVxuXHRCQ1c6ICthY3Rpb25QZXJmb3JtZWQoQWN0aW9uRXZlbnQgZSlcblx0Y2xhc3MgSG9tZUdVSXtcblx0XHQrIEhvbWVHVUkoKSBcbiAgICB2YWx1ZUNoYW5nZWQoTGlzdEFjdGlvbkV2ZW50IGUpIFxuXG4gICAgK2FjdGlvblBlcmZvcm1lZChBY3Rpb25FdmVudCBlKVxuXHR9XG5cdGNsYXNzIFVzZXJ7XG5cblx0XHQrU3RyaW5nIG5hbWVcbiAgICArU3RyaW5nIGFjXG4gICAgK1N0cmluZyBhbW50XG4gICAgK1N0cmluZyBjb250YWN0XG4gICAgK2NoYXIgW10gYWNudW1cbiAgICArY2hhciBbXSBwaW5cblxuXHRcdCtOZXdVc2VyKClcbiAgICArRXhpc3RpbmdVc2VyKClcblx0fVxuXHRjbGFzcyAgIE9wZXJhdGlvbnN7XG5cdFx0K3dhbXQgOmZsb2F0XG4gICAgK2RhbXQ6IGZsb2F0XG4gICAgK2JhbCA6IGZsb2F0XG4gICAgK2RhdGEgOiBTdHJpbmdcbiAgICArZmJhbCAgOiBjaGFyW11cbiAgICArdXNlciA6IGNoYXJbXVxuICAgICthY2NvdW50OiAgY2hhcltdXG4gICAgK2w6IGludFxuICAgICtkZXNwb3NpdChTdHJpbmcgdXNlcnBhc3MpXG4gICAgK3dpdGhkcmF3KFN0cmluZyBubXBhc3MpXG4gICAgK2lucXVlcnkoU3RyaW5nIG5tcGFzcylcbiAgXG5cdH1cblxuXHRjbGFzcyBQcmVkaWN0e1xuICArUHJlZGljdCgpXG4gIH1cdFx0XHRcdCIsIm1lcm1haWQiOnsidGhlbWUiOiJkZWZhdWx0In0sInVwZGF0ZUVkaXRvciI6ZmFsc2V9)](https://mermaid-js.github.io/mermaid-live-editor/#/edit/eyJjb2RlIjoiY2xhc3NEaWFncmFtXG5cdEJDVyAtLT4gUHJlZGljdFxuICBCQ1cgLS0-IEhvbWVHVUlcbiAgUHJlZGljdCAtLT5ETDRqXG5cbiAgSG9tZUdVSSAtLT5Vc2VyXG4gIFVzZXIgLS18Pk9wZXJhdGlvbnNcblxuXHRCQ1cgOiArYWdlICA6ICAgICBpbnRcblx0QkNXIDogK2dlbmRlcjogIFN0cmluZ1xuXHRCQ1c6ICtCQ1coKVxuXHRCQ1c6ICthY3Rpb25QZXJmb3JtZWQoQWN0aW9uRXZlbnQgZSlcblx0Y2xhc3MgSG9tZUdVSXtcblx0XHQrIEhvbWVHVUkoKSBcbiAgICB2YWx1ZUNoYW5nZWQoTGlzdEFjdGlvbkV2ZW50IGUpIFxuXG4gICAgK2FjdGlvblBlcmZvcm1lZChBY3Rpb25FdmVudCBlKVxuXHR9XG5cdGNsYXNzIFVzZXJ7XG5cblx0XHQrU3RyaW5nIG5hbWVcbiAgICArU3RyaW5nIGFjXG4gICAgK1N0cmluZyBhbW50XG4gICAgK1N0cmluZyBjb250YWN0XG4gICAgK2NoYXIgW10gYWNudW1cbiAgICArY2hhciBbXSBwaW5cblxuXHRcdCtOZXdVc2VyKClcbiAgICArRXhpc3RpbmdVc2VyKClcblx0fVxuXHRjbGFzcyAgIE9wZXJhdGlvbnN7XG5cdFx0K3dhbXQgOmZsb2F0XG4gICAgK2RhbXQ6IGZsb2F0XG4gICAgK2JhbCA6IGZsb2F0XG4gICAgK2RhdGEgOiBTdHJpbmdcbiAgICArZmJhbCAgOiBjaGFyW11cbiAgICArdXNlciA6IGNoYXJbXVxuICAgICthY2NvdW50OiAgY2hhcltdXG4gICAgK2w6IGludFxuICAgICtkZXNwb3NpdChTdHJpbmcgdXNlcnBhc3MpXG4gICAgK3dpdGhkcmF3KFN0cmluZyBubXBhc3MpXG4gICAgK2lucXVlcnkoU3RyaW5nIG5tcGFzcylcbiAgXG5cdH1cblxuXHRjbGFzcyBQcmVkaWN0e1xuICArUHJlZGljdCgpXG4gIH1cdFx0XHRcdCIsIm1lcm1haWQiOnsidGhlbWUiOiJkZWZhdWx0In0sInVwZGF0ZUVkaXRvciI6ZmFsc2V9)
## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tr>
    <td align="center"><a href="https://github.com/imchayan1999"><img src="https://avatars2.githubusercontent.com/u/45001843?v=4" width="100px;" alt=""/><br /><sub><b>Chayan Sharma</b></sub></a><br /><a href="#projectManagement-imchayan1999" title="Project Management">📆</a></td>
  </tr>
</table>

<!-- markdownlint-enable -->
<!-- prettier-ignore-end -->
<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!
